package dataStructures.queue.basedOnLinkedList;

public class Link {
    public long data;                       // данные
    public Link next;                       // следующий элемент в списке

    public Link(long value) {               // конструктор
        data = value;
    }

    public void displayLink() {             // вывод содержимого элемента
        System.out.print("{" + data + "} ");
    }
}
