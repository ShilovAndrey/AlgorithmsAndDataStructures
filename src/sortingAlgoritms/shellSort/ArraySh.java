package sortingAlgoritms.shellSort;

public class ArraySh {

    private long[] theArray;
    private int nElements;

    public ArraySh(int size){
        theArray=new long[size];
        nElements=0;
    }

    public void insert(long value){
        theArray[nElements++]=value;
    }

    public void display(){
        System.out.print("A= ");
        for(int i=0;i<nElements;i++){
            System.out.print(theArray[i]+" ");
        }
        System.out.println();
    }

    public void shellSort(){
        int inner, outer;
        long temp;
        int h=1;                     // вычисление исходного значения h
        while(h<=nElements/3)
            h=h*3+1;                 // (1,4,13,40,121,...)
        while(h>0){                  // последовательное уменьшение h до 1
            for(outer=h;outer<nElements;outer++){    // h-сортировка файла
                temp=theArray[outer];
                inner=outer;
                while(inner>h-1&&theArray[inner-h]>=temp){  // первый подмассив (0,4,8)
                    theArray[inner]=theArray[inner-h];
                    inner-=h;
                }
                theArray[inner]=temp;
            }
            h=(h-1)/3;               // уменьшение h
        }
    }
}
