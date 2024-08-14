public class ScoreBoardList {

    private List board;

    public ScoreBoardList(){

    }

    public void add(GameEntry e){
        /* Se crea un nodo auxiliar */
        Node n = new Node(e);
        if (board.isEmpty()){
            board.addFirst(e);
        } else{
            Node temp = board.First();
            //while (temp != null && temp.getData() < e.getScore()){

        }

    }

    public void remove(String n){

    }

}
