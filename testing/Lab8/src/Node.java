public class Node {
    private Object data ;
    private Node left ;
    private Node right ;

    public Node(){
        data = null ;
        left = null ;
        right = null ;
    }

    public Node(Object d){
        data = d ;
        left = null ;
        right = null ;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
}
