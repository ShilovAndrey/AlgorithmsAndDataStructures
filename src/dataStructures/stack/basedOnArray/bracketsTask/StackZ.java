package dataStructures.stack.basedOnArray.bracketsTask;

public class StackZ {
    private int maxSize;
    private char [] stackArray;
    private int top;
    public StackZ(int size){            // конструктор
        maxSize=size;
        stackArray=new char[maxSize];
        top=-1;
    }
    public void push(char element){     // размещение элемента на вершине стека
        stackArray[++top]=element;
    }
    public char pop(){                  // извлечение элемента с вершины стека
        return stackArray[top--];
    }
    public boolean isEmpty(){           // true, если стек пуст
        return (top==-1);
    }
}
