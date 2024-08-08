public class Node {

    private Object data;
    private Node next;


    public Node(){
        Node a = new Node();
        a.setNext(null);
        a.setData(null);
    }

    public Node(Object e){
        Node nuevo = new Node();
        nuevo.setData(e);
        nuevo.setNext(null);

    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
