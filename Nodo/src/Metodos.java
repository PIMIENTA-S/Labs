public class Metodos {

    private Nodo inicio;
    private Nodo fin;


    public void Metodos(){
        inicio = null;
        fin = null;
    }

    public void insertarInicio(String c){
        Nodo nuevo = new Nodo(c, inicio);

        inicio = nuevo;

        if (fin == null){
            fin = inicio;
        }

    }

    public void insertarFinal(String c){

        Nodo n = new Nodo(c, null);
        if (inicio == null){
            fin = n;
            inicio = fin;
        }else{
            fin.setSiguiente(n);
            fin = n;
        }


    }

    public void eliminarInicio(){
        inicio = inicio.getSiguiente();
    }

    public void mostrarList(){

        Nodo temp = inicio;

        while (temp != null){
            System.out.println(temp.getContiene());
            temp = temp.getSiguiente();
        }
    }


}
