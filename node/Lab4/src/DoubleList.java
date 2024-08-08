import java.lang.reflect.Field;

public class DoubleList {

    private DoubleNode head;
    private DoubleNode tail;
    private int size;

    public DoubleList(){

        head = null;
        tail = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public Boolean isEmpty(){
        if (size == 0){
            return true;
        }
        return false;
    }

    public DoubleNode First(){
        return head;
    }

    public DoubleNode Last(){
        return tail;
    }

    public void addFirst(Object e){
        DoubleNode n = new DoubleNode(e);

        if (isEmpty()){
            head = n;
            tail = n;
        } else{
            n.setNext(head);
            head.setPrev(n);
            head = n;
        }
        size ++;

    }

    public void addLast(){
        

    }

    public void removeFirst(){

    }

    public void removeLast(){

    }




    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}
