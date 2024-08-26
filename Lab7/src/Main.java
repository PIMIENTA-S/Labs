import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Mapa");

        Heap heap = new Heap(11);
        int[] A = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};

        System.out.println("Arreglo inicial: " + Arrays.toString(A));

        heap.MAX_HEAPIFY(A,0, A.length);
        System.out.println("Arreglo con max_heapify: " + Arrays.toString(A));

        heap.BUILD_MAX_HEAP(A);
        System.out.println("Array Construido con Build: " + Arrays.toString(A));

        //System.out.println(heap.HEAP_EXTRACT_MAX(A));

        System.out.println();

        heap.HEAPSORT(A);
        System.out.println("Arreglo ordenado: " + Arrays.toString(A));

        //heap.MAX_HEAP_INSERT(A, 12);

        //Heap.print(A);




    }
}