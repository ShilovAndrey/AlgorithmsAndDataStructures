package dataStructures.stack;

public class StackX {
    private int maxSize;   // размер массива
    private long[] stackArray;
    private int top;       // вершина стека

    public StackX(int s){  // конструктор
        maxSize=s;         // определение размера стека
        stackArray=new long[maxSize];  // создание массива
        top=-1;            // пока нет ни одного элемента
    }
    public void push(long value){  // размещение элемента на вершине стека
    stackArray[++top]=value;  // увеличение top, вставка элемента
    }
    public long pop(){     // извлечение элемента с вершины стека
        return stackArray[top--];  // извлечение элемента, уменьшение top
    }
    public long peek(){     // чтение элемента с вершины стека
        return stackArray[top];
    }
    public boolean isEmpry(){  // true, если стек пуст
        return (top==-1);
    }
    public boolean isFull(){  // true, если стек полон
        return (top==maxSize-1);
    }

}
