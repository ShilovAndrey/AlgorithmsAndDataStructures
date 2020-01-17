package arrays.OrderedArray;

public class OrderedArray {
    private long[] array;
    int nElements;

    public OrderedArray(int size){
        array=new long[size];
        nElements=0;
    }
    public int size(){
        return nElements;
    }
    public boolean find(long searchValue){
        int i;
        for(i=0;i<nElements;i++) {
            if (array[i] == searchValue)
                break;
        }
        if (i==nElements)
            return false;
        else
            return true;
    }
    public int findBin(long searchValue){
        int low=0;
        int high=nElements-1;
        int curIn;
        while(true){
            curIn=(low+high)/2;
            if(array[curIn]==searchValue)
                return curIn;
            else if(low>high)
                return nElements;
            else{
                if(array[curIn]<searchValue)
                    low=curIn+1;
                else
                    high=curIn-1;
            }
        }
    }
    public void insert(long value){
        int i;
        for(i=0;i<nElements;i++){
            if(array[i]>value)
                break;
        }
        for(int k=nElements;k>i;k--)
            array[k]=array[k-1];
        array[i]=value;
        nElements++;
    }
    public boolean delete(long value){
        int j = findBin(value);
        if(j==nElements)
            return false;
        else
            for(int k=j;k<nElements;k++)
                array[k]=array[k+1];
            nElements--;
            return true;
    }
    public void display(){
        for (int i = 0; i <nElements ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
