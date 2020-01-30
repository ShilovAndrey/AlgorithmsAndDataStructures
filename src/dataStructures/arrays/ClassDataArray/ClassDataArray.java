package dataStructures.arrays.ClassDataArray;

public class ClassDataArray {
    private Person[] arr;
    private int nElements;
    public ClassDataArray(int maxSize){
        arr=new Person[maxSize];
        nElements=0;
    }
    public int getSize(){
        return nElements;
    }
    public Person find(String searchName){
        int i;
        for (i = 0;  i<nElements ; i++) {
            if(arr[i].getLast().equals(searchName))
                break;
        }
        if (i==nElements)
            return null;
        else
            return arr[i];

    }
    public void insert(String firstName,String lastName,int age){
        arr[nElements]= new Person(firstName,lastName,age);
        nElements++;
    }
    public boolean delete(String searchName){
        int i;
        for(i=0;i<nElements;i++){
            if(arr[i].getLast().equals(searchName))
                break;
        }
        if (i==nElements)
            return false;
        else{
            for(int k=i;k<nElements;k++)
                arr[k]=arr[k+1];
        }
        nElements--;
        return true;
    }
    public void display(){
        for (int i=0;i<nElements;i++)
            arr[i].displayPerson();
    }
}
