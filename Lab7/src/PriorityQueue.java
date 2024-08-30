import java.util.Arrays;

public class PriorityQueue {

    public static void main(String[] args){
        System.out.println("Colas de prioridad");

        Heap heap = new Heap(11);
        int[] A = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};


        heap.MAX_HEAP_INSERT(A, 6);

        System.out.println(Arrays.toString(A));

        

    }



}
