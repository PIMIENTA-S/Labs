public class ScoreBoardList {

    private List board;

    public ScoreBoardList(){
        board = new List();

    }

    public void add(Node e){
        /* Se crea un nodo auxiliar */
        Node n = new Node(e);
        if (board.isEmpty()){
            board.addFirst(e);
        } else{
            Node temp = board.First();
            //while (temp != null && temp.getData() < e.getData()){

        }

    }

    public void remove(String n){

    }

}
