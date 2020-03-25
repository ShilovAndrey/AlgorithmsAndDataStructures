package dataStructures.graph.wide_walk;


import java.util.LinkedList;

public class Queue {
    private LinkedList<Integer> theList;

    public Queue(){
        theList=new LinkedList<>();
    }

    public void push(int value){
        theList.addLast(value);
    }

    public int peek(){
        return theList.peekFirst();
    }

    public int remove(){
        return theList.remove();
    }

    public boolean isEmpty(){
        return (theList.isEmpty());
    }
}
