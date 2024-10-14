import java.util.Arrays;

// Clase Heap con correcciones
public class Heap {

    public int[] A;
    int heap_size;

    public Heap(int capacity){
        A = new int[capacity];
        heap_size = 0; // Inicializamos el heap_size en 0
    }

    public int Parent(int i) {
        return (i - 1) / 2;
    }
    public static int left(int i){
        return 2 * i + 1;
    }
    public static int rigth(int i){
        return 2 * i + 2;
    }

    public void MAX_HEAP_INSERT(int k) {
        if (heap_size >= A.length) {
            throw new IllegalStateException("Heap overflow");
        }

        heap_size++;
        int i = heap_size - 1; // Iniciar en el índice correcto

        A[i] = k; // Inserta el nuevo elemento al final del heap

        // Corrige el heap si es necesario
        while (i > 0 && A[Parent(i)] < A[i]) {
            int temp = A[Parent(i)];
            A[Parent(i)] = A[i];
            A[i] = temp;
            i = Parent(i);
        }
    }

    public static void print(int[] A, int heap_size) {
        for (int i = 0; i < heap_size; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public static void print(int[] A){
        for(int i = 0; i < A.length/2; i++){
            System.out.println("Parent Node: " + A[i]);

            if(left(i) < A.length){
                System.out.println("Left Child Node: " + A[left(i)]);
            }

            if(rigth(i) < A.length){
                System.out.println("Rigth Child Node: " + A[rigth(i)]);
            }
            System.out.println();
        }
    }
}

