package sortingAlgoritms.bubbleSort;

public class ArrayBub {
    private long[] arr;
    private int nElements;
    public ArrayBub(int maxSize){
        arr=new long[maxSize];
        nElements=0;
    }
    public void insert(long value){
        arr[nElements]=value;
        nElements++;
    }
    public void display(){
        for (int i = 0; i <nElements ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void bubbleSort(){
        int in,out;
        for (out=nElements-1;out>1;out--){
            for(in=0;in<out;in++){
                if(arr[in]>arr[in+1]){
                    long temp=arr[in];
                    arr[in]=arr[in+1];
                    arr[in+1]=temp;
                }
            }
        }
    }
}
