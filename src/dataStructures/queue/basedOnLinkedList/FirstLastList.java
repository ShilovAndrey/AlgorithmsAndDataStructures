package dataStructures.queue.basedOnLinkedList;

public class FirstLastList {
    private Link first;                      // ссылка на первый элемент
    private Link last;                       // ссылка на последний элемент

    public FirstLastList(){                  // конструктор
        first=null;                          // список пока не содержит элементов
        last=null;
    }

    public boolean isEmpty(){                // true, если список пуст
        return (first==null);
    }

    public void insertLast(long value){      // вставка элемента в конец списка
        Link newLink = new Link(value);      // создание нового элемента
        if(isEmpty())                        // если список пуст
            first=newLink;                   // first --> newLink
        else
            last.next=newLink;               // старое значение last --> newLink
        last=newLink;                        // newLink <-- last
    }

    public long deleteFirst(){               // удаление первого элемента (предполагается, что список не пуст)
        long temp=first.data;
        if(first.next==null)
            last=null;
        first=first.next;
        return temp;
    }

    public void displayList(){
        Link current=first;                  // от начала списка
        while(current!=null){                // перемещение до конца списка
            current.displayLink();           // вывод данных
            current=current.next;            // переход к следующему элементу
        }
        System.out.println();
    }
}
