package dataStructures.heap;

public class Node {

    private int iData;

    public Node(int key){
        iData=key;
    }

    public void displayNode(){
        System.out.print(iData+" ");
    }

    public int getKey(){
        return iData;
    }

    public void setKey(int key){
        iData=key;
    }
}
