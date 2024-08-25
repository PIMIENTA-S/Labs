public class Heap {

    public void MAX_HEAPIFY(int[] A, int i, int heap_size){
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < heap_size && A[l] > A[i]){
            largest = l;
        }
        if (r < heap_size && A[r] > A[i]){
            largest = r;
        }

        if(largest != i){
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            MAX_HEAPIFY(A, largest, heap_size);
        }


    }

    public void BUILD_MAX_HEAP(int[] A){
        int heap_size = A.length;
        for (int i =  heap_size/ 2 - 1; i > 0; i --){
            MAX_HEAPIFY(A, i, heap_size);
        }

    }

    public void HEAPSORT(int[] A){
        BUILD_MAX_HEAP(A);

        int heap_size = A.length;
        for(int i = heap_size - 1; i > 0; i--){
            int temp = A[i];
            A[i] = A[0];
            A[0] = temp;
            heap_size --;

            MAX_HEAPIFY(A, 0, heap_size);

        }

    }

    public void MAX_HEAP_INSERT(int[] A, int k){
        int heap_size = A.length;
        

    }

}
