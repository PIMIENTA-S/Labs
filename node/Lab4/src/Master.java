public class Master {

    public static void main(String[] args){

        List nuevaLista = new List();

        Object data = "sisa";
        Object data1 = "sisa1";
        Object data2 = "sisa2";

        nuevaLista.addFirst(data);
        nuevaLista.addLast(data1);
        nuevaLista.addLast(data2);

        System.out.println(nuevaLista.First().getData());
        //nuevaLista.mostrarList();

    }

}
