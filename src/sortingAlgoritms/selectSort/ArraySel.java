package sortingAlgoritms.selectSort;

public class ArraySel {
    private long[] arr;
    private int nElements;

    public ArraySel(int maxSize) {
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
    public void selectionSort(){
        int in,out,min;
        for(out=0;out<nElements-1;out++){
            min=out;
            for(in=out+1;in<nElements;in++) {
                if (arr[in] < arr[min])
                    min = in;
            }
            swap(out,min);
        }
    }
    private void swap(int one,int two){
        long temp=arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    }
}
