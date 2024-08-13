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



    public Object remove(DoubleNode n){
        if (n == head){
            removeFirst();
        } else if(n == tail){
            removeLast();
        }
        else{
            Object e = n.getData();
            DoubleNode p = n.getPrev();
            DoubleNode nx = n.getNext();
            p.setNext(nx);
            nx.setPrev(p);
            n.setNext(null);
            n.setPrev(null);
            size --;
            return e;
        }
        return null;
    }

    public Object addBefore(DoubleNode n, Object e){
        if (n==head){
            addFirst(n);
        }else{
            DoubleNode m = new DoubleNode(e);
            DoubleNode p = n.getPrev();
            p.setNext(m);
            m.setPrev(p);
            m.setNext(n);
            n.setPrev(m);
            size ++;
            return e;
        }

        return e;
    }

    public Object addAfter(DoubleNode n, Object e){
        if (n==tail){
            addLast(n);
        }else{
            DoubleNode m = new DoubleNode(e);
            DoubleNode nx = n.getNext();
            n.setNext(m);
            m.setPrev(n);
            m.setNext(nx);
            nx.setPrev(m);
            size ++;
            return e;
        }
        return e;
    }

    public void showList(){
        DoubleNode a = head;
        while (a != tail){
            System.out.println(a.getData());
            a = a.getNext();
        }
        System.out.println(a.getData());
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}
