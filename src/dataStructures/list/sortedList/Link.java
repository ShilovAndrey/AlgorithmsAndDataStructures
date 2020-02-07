package dataStructures.list.sortedList;

public class Link {
    public long data;                  // данные
    public Link next;                  // ссылка на следующий элемент списка

    public Link(long value){           // конструктор
        data=value;
    }

    public void displayLink(){         // вывод содержимого элемента
        System.out.print("{"+data+"}");
    }
}
