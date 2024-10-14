public class BinaryTree {

    public Node root;
    public int size;

    public BinaryTree(){
        root = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isRoot(Node v){
        return v==root;
    }

    public boolean isInternal(Node v){
        return hasLeft(v) || hasRight(v);
    }

    public boolean hasLeft(Node v){
        return v.getLeft()!=null;
    }

    public boolean hasRight(Node v){
        return v.getRight()!=null;
    }

    // demas metodos

    public int depth(Node v){
        if (isRoot(v)){
            return 0;
        }
        else{
            //return 1 + depth(parent(v));
        }
        return 1;
    }








}
