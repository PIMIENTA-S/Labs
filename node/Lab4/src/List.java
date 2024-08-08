public class List {

    private Node head;
    private Node tail;
    private int size;

    public void List(){
        head = null;
        tail = null;
        size = 0;

    }

    public int size(){
        return 3;

    }

    public Boolean isEmpty(){
        return true;

    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node First(){ // retorna un node
        return head;
    }

    public Node Last(){
        return tail;

    }

    public void addFirst(Object e){
        Node n = new Node(e);
        if (isEmpty()){
            head = n;
            tail = n;
        }else{
            n.setNext(head);
            head = n;
        }
        size++;

    }

    public void addLast(Object e){

        

    }

    public void removeFirst(){ //retorna un object

    }

    public void removeLast(){

    }
}
