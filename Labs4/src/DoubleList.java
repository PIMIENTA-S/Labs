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

    public boolean isEmpty(){
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

    public void addLast(Object e){
        DoubleNode n = new DoubleNode(e);

        if (isEmpty()){
            head = n;
        } else{
            tail.setNext(n);
            n.setPrev(tail);
        }
        tail = n;
        size ++;

    }

    public Object removeFirst(){
        DoubleNode temp = head;
        if (isEmpty()){
            return null;
        }else {
            head = head.getNext();
            temp.setNext(null);
            head.setPrev(null);
            size --;
            return temp.getData();
        }

    }

    public Object removeLast(){
        DoubleNode temp = tail;

        if(isEmpty()){
            return null;
        }else{
            tail = temp.getPrev();
            tail.setNext(null);
            temp.setPrev(null);
            size --;
            return temp.getData();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}
