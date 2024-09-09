public class bst {

    private Object data;
    private int k;


    public bst(Object e, int k){
        data = e ;
        this.k = k;
    }

    public void setData(Object d){
        data = d ;
    }

    public void setKey(int k){
        this.k  = k ;
    }

    public Object getData(){
        return data ;
    }

    public int getKey(){
        return this.k ;
    }

    @Override
    public String toString() {
        return "bst{" +
                "data=" + data +
                ", k=" + k +
                '}';
    }
}
