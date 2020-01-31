package dataStructures.stack.bracketsTask;

public class StackZ {
    private int maxSize;
    private char [] stackArray;
    private int top;
    public StackZ(int size){
        maxSize=size;
        stackArray=new char[maxSize];
        top=-1;
    }
    public void push(char element){
        stackArray[++top]=element;
    }
    public char pop(){
        return stackArray[top--];
    }
    public boolean isEmpty(){
        return (top==-1);
    }
}
