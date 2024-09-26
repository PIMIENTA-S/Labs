import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Grafo {
    Map<String, List<Arista>> adjacencia;

    public Grafo() {
        adjacencia = new HashMap<>();
    }

    public void agregarArista(String ciudadA, String ciudadB, int distancia, int tiempo) {
        adjacencia.putIfAbsent(ciudadA, new ArrayList<>());
        adjacencia.putIfAbsent(ciudadB, new ArrayList<>());
        adjacencia.get(ciudadA).add(new Arista(ciudadB, distancia, tiempo));
        adjacencia.get(ciudadB).add(new Arista(ciudadA, distancia, tiempo));
    }

    public boolean estanConectadas(String ciudadA, String ciudadB) {
        return adjacencia.getOrDefault(ciudadA, Collections.emptyList())
                .stream().anyMatch(a -> a.ciudad.equals(ciudadB));
    }

    public Result dijkstra(String origen, String destino, String tipo) {
        PriorityQueue<Estado> queue = new PriorityQueue<>(Comparator.comparingInt(e -> e.pesoAcumulado));
        queue.add(new Estado(origen, 0));
        Set<String> visitados = new HashSet<>();
        Map<String, Integer> distancias = new HashMap<>();
        Map<String, String> predecesores = new HashMap<>();

        for (String ciudad : adjacencia.keySet()) {
            distancias.put(ciudad, Integer.MAX_VALUE);
        }
        distancias.put(origen, 0);

        while (!queue.isEmpty()) {
            Estado estado = queue.poll();
            String ciudadActual = estado.ciudad;
            int pesoAcumulado = estado.pesoAcumulado;

            if (visitados.contains(ciudadActual)) {
                continue;
            }
            visitados.add(ciudadActual);

            for (Arista arista : adjacencia.getOrDefault(ciudadActual, Collections.emptyList())) {
                int peso = tipo.equals("distancia") ? arista.distancia : arista.tiempo;
                int nuevaDistancia = pesoAcumulado + peso;

                if (nuevaDistancia < distancias.get(arista.ciudad)) {
                    distancias.put(arista.ciudad, nuevaDistancia);
                    predecesores.put(arista.ciudad, ciudadActual);
                    queue.add(new Estado(arista.ciudad, nuevaDistancia));
                }
            }
        }

        // Reconstruir el camino
        List<String> camino = new ArrayList<>();
        String ciudadActual = destino;
        while (ciudadActual != null) {
            camino.add(ciudadActual);
            ciudadActual = predecesores.get(ciudadActual);
        }
        Collections.reverse(camino);

        return distancias.get(destino) != Integer.MAX_VALUE ?
                new Result(distancias.get(destino), camino) : new Result(null, null);
    }

    public void listarConexiones() {
        System.out.println("Conexiones disponibles:");
        for (String ciudadA : adjacencia.keySet()) {
            for (Arista arista : adjacencia.get(ciudadA)) {
                System.out.println(ciudadA + " -> " + arista.ciudad + ": " + arista.distancia + " km, " + arista.tiempo + " minutos");
            }
        }
        System.out.println();
    }
}

class Arista {
    String ciudad;
    int distancia;
    int tiempo;

    public Arista(String ciudad, int distancia, int tiempo) {
        this.ciudad = ciudad;
        this.distancia = distancia;
        this.tiempo = tiempo;
    }
}

class Estado {
    String ciudad;
    int pesoAcumulado;

    public Estado(String ciudad, int pesoAcumulado) {
        this.ciudad = ciudad;
        this.pesoAcumulado = pesoAcumulado;
    }
}

class Result {
    Integer distancia;
    List<String> camino;

    public Result(Integer distancia, List<String> camino) {
        this.distancia = distancia;
        this.camino = camino;
    }
}

public class Main {
    public static Grafo cargarGrafo(String archivo) throws IOException {
        Grafo grafo = new Grafo();
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String linea;
        br.readLine(); // Saltar encabezado

        while ((linea = br.readLine()) != null) {
            String[] fila = linea.split(",");
            if (fila.length < 4) continue;

            String ciudadA = fila[0].trim();
            String ciudadB = fila[1].trim();
            try {
                int distancia = Integer.parseInt(fila[2].trim().replace("KM", ""));
                int tiempo = Integer.parseInt(fila[3].trim().replace("min", ""));
                grafo.agregarArista(ciudadA, ciudadB, distancia, tiempo);
            } catch (NumberFormatException e) {
                System.out.println("Advertencia: No se pudo convertir los datos para " + ciudadA + " y " + ciudadB + ".");
            }
        }
        br.close();
        return grafo;
    }
    public static void main(String[] args) throws IOException {
        Grafo grafo = cargarGrafo("Datos vias Colombia.csv");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Comprobar si dos ciudades están conectadas");
            System.out.println("2. Camino más corto por distancia");
            System.out.println("3. Camino más corto por tiempo");
            System.out.println("4. Listar conexiones");
            System.out.println("5. Salir\n");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            if (opcion == 1) {
                System.out.print("\nIngrese la ciudad A: ");
                String ciudadA = scanner.nextLine().trim();
                System.out.print("Ingrese la ciudad B: ");
                String ciudadB = scanner.nextLine().trim();
                if (grafo.estanConectadas(ciudadA, ciudadB)) {
                    System.out.println("Las ciudades " + ciudadA + " y " + ciudadB + " están conectadas.");
                } else {
                    System.out.println("Las ciudades " + ciudadA + " y " + ciudadB + " no están conectadas.");
                }

            } else if (opcion == 2) {
                System.out.print("\nIngrese la ciudad A: ");
                String ciudadA = scanner.nextLine().trim();
                System.out.print("Ingrese la ciudad B: ");
                String ciudadB = scanner.nextLine().trim();
                Result resultado = grafo.dijkstra(ciudadA, ciudadB, "distancia");
                if (resultado.distancia != null) {
                    System.out.println("La distancia más corta entre " + ciudadA + " y " + ciudadB + " es " + resultado.distancia + " km.");
                    System.out.println("El camino es:");
                    for (int i = 0; i < resultado.camino.size() - 1; i++) {
                        String actual = resultado.camino.get(i);
                        String siguiente = resultado.camino.get(i + 1);
                        for (Arista arista : grafo.adjacencia.get(actual)) {
                            if (arista.ciudad.equals(siguiente)) {
                                System.out.println(actual + " -> " + siguiente + ": " + arista.distancia + " km");
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("No hay un camino entre " + ciudadA + " y " + ciudadB + ".");
                }

            } else if (opcion == 3) {
                System.out.print("\nIngrese la ciudad A: ");
                String ciudadA = scanner.nextLine().trim();
                System.out.print("Ingrese la ciudad B: ");
                String ciudadB = scanner.nextLine().trim();
                Result resultado = grafo.dijkstra(ciudadA, ciudadB, "tiempo");
                if (resultado.distancia != null) {
                    System.out.println("El tiempo más corto entre " + ciudadA + " y " + ciudadB + " es " + resultado.distancia + " minutos.");
                    System.out.println("El camino es:");
                    for (int i = 0; i < resultado.camino.size() - 1; i++) {
                        String actual = resultado.camino.get(i);
                        String siguiente = resultado.camino.get(i + 1);
                        for (Arista arista : grafo.adjacencia.get(actual)) {
                            if (arista.ciudad.equals(siguiente)) {
                                System.out.println(actual + " -> " + siguiente + ": " + arista.tiempo + " minutos");
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("No hay un camino entre " + ciudadA + " y " + ciudadB + ".");
                }

            } else if (opcion == 4) {
                grafo.listarConexiones();

            } else if (opcion == 5) {
                break;

            } else {
                System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
}