package dataStructures.stack.basedOnLinkedList;

public class LinkStack {
    private LinkList theList;

    public LinkStack() {                 // конструктор
        theList = new LinkList();
    }

    public void push(long value) {       // размещение элемента на вершине стека
        theList.insertFirst(value);
    }

    public long pop() {                  // извлечение элемента с вершины стека
        return theList.deleteFirst();
    }

    public boolean isEmpty() {           // true, если стек пуст
        return (theList.isEmpty());
    }

    public void displayStack() {
        System.out.print("Stack (top-->bottom): ");
        theList.displayList();
    }
}
