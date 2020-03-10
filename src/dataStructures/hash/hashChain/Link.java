package dataStructures.hash.hashChain;

public class Link {
    private int iData;
    public Link next;

    public Link(int value){
        iData=value;
    }

    public int getKey(){
        return iData;
    }

    public void displayLink(){
        System.out.print(iData+" ");
    }
}
