public class Main {
    public static void main(String[] args) {

        DoubleList prueba = new DoubleList();

        prueba.addLast("Testing 1");
        prueba.addLast("Testing 2");
        prueba.addLast("Testing 3");
        prueba.addLast("Testing 4");
        prueba.addLast("Testing 5");
        prueba.addLast("Testing 6");

        Object e = "Angell";
        DoubleNode p1 = new DoubleNode(e);



        prueba.showList();
    }
}