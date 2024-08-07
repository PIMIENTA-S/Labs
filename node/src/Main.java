public class Main {
    public static void main(String[] args) {

        String persona1 = "Pimienta";
        String persona2 = "Sierra";
        String persona3 = "Ramos";
        String persona4 = "Martinez";
        String persona5 = "Bita";


        Nodo p1 = new Nodo(persona1);
        Nodo p2 = new Nodo(persona2);
        Nodo p3 = new Nodo(persona3);
        Nodo p4 = new Nodo(persona4);
        Nodo p5 = new Nodo(persona5);

        p1.setSiguiente(p2);
        p2.setSiguiente(p3);
        p3.setSiguiente(p4);
        p4.setSiguiente(p5);



    }
}