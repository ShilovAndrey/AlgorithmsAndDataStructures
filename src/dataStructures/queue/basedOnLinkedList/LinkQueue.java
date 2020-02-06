package dataStructures.queue.basedOnLinkedList;

public class LinkQueue {
    private FirstLastList theList;

    public LinkQueue(){                           // конструктор
        theList=new FirstLastList();              // создание 2-стороннего списка
    }

    public boolean isEmpty(){                     // true, если очередь пуста
        return (theList.isEmpty());
    }

    public void insert(long value){               // вставка элемента в конец очереди
        theList.insertLast(value);
    }

    public long remove(){                         // удаление элемента в начале очереди
        return theList.deleteFirst();
    }

    public void displayQueue(){
        System.out.println("Queue (front --> rear): ");
        theList.displayList();
    }
}
