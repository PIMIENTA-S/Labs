public class Metodos {

    private Nodo inico;
    private Nodo fin;


    public void Metodos(){
        inico = null;
        fin = null;
    }

    public void insertarInicio(String c){
        Nodo nuevo = new Nodo(c, inico);

        inico = nuevo;

        if (fin == null){
            fin = inico;
        }

    }

    public void eliminarInicio(){
        inico = inico.getSiguiente();
    }

    public void mostrarList(){

        Nodo temp = inico;

        while (temp != null){
            System.out.println(temp.getContiene());
            temp = temp.getSiguiente();
        }
    }


}
