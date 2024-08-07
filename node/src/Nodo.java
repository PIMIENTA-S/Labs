public class Nodo {

    private Nodo siguiente;
    private String contiene;

    public Nodo(){
        setSiguiente(null);
        setContiene(null);
    }

    public Nodo(String c){
        setSiguiente(null);
        setContiene(c);
    }

    public Nodo(String c,Nodo s){
        setSiguiente(s);
        setContiene(c);
    }


    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public String getContiene() {
        return contiene;
    }

    public void setContiene(String contiene) {
        this.contiene = contiene;
    }
}
