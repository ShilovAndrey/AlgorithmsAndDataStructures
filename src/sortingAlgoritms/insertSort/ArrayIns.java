package sortingAlgoritms.insertSort;

public class ArrayIns {
    private long[] arr;
    private int nElements;

    public ArrayIns(int maxSize) {
        arr = new long[maxSize];
        nElements = 0;
    }

    public void insert(long value) {
        arr[nElements] = value;
        nElements++;
    }

    public void display() {
        for (int i = 0; i < nElements; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void insertionSort(){
        int in,out;
        for(out=1;out<nElements;out++){
            long temp=arr[out];
            in=out;
            while(in>0&&arr[in-1]>temp) {
                arr[in] = arr[in - 1];
                in--;
            }
            arr[in]=temp;
        }
    }
}
