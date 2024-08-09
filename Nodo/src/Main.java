public class Main {
    public static void main(String[] args) {

        String persona1 = "Pimienta";
        String persona2 = "Sierra";
        String persona3 = "Ramos";
        String persona4 = "Martinez";
        String persona5 = "Bita";

        String testing = "Inicio";
        Metodos t1 = new Metodos();

        t1.insertarInicio("hola");
        t1.insertarFinal("que mas");
        t1.insertarFinal("Todo firme que?");
        
        t1.eliminarInicio();
        t1.mostrarList();




        Nodo p1 = new Nodo(persona1);
        Nodo p2 = new Nodo(persona2);
        Nodo p3 = new Nodo(persona3);
        Nodo p4 = new Nodo(persona4);
        Nodo p5 = new Nodo(persona5);

        p1.setSiguiente(p2);
        p2.setSiguiente(p3);
        p3.setSiguiente(p4);
        p4.setSiguiente(p5);



        Nodo aux = p1;
        
        while (aux.getSiguiente() != null){
            System.out.println(aux.getContiene());
            aux = aux.getSiguiente();
        }

//        for (int i = 0; i < 5; i++){
//
//            String aux2 = (String)aux.getContiene();
//            System.out.println(aux2);
//            aux = aux.getSiguiente();
//
//        }





    }
}