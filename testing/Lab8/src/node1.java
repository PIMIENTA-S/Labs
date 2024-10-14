public class node1 {

    private Object data;
    private Node right;
    private Node left;
    private Node parent;

    public node1() {
        data = null;
        right = null;
        left = null;
        parent = null;
    }

    public node1(Object d) {
        data = d;
        right = null;
        left = null;
        parent = null;
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

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "node1{" +
                "data=" + data +
                ", right=" + right +
                ", left=" + left +
                ", parent=" + parent +
                '}';
    }
}
