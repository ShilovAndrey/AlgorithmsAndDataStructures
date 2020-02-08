package dataStructures.list.sortedList;

public class SortedList {
    private Link first;                             // ссылка на первый элемент списка

    public SortedList(){                            // конструктор
        first=null;
    }

    public boolean isEmpty(){                       // true, если список пуст
        return (first==null);
    }

    public void insert(long value){                // вставка в порядке сортировки
        Link newLink = new Link(value);            // создание нового элемента
        Link previous=null;                        // от начала списка
        Link current=first;
        while(current!=null&&value<current.data){  // до конца списка или если value>current.data
            previous=current;
            current=current.next;                  // перейти к следующему элементу
        }
        if(previous==null)                         // в начале списка
            first=newLink;
        else                                       // не в начале списка
            previous.next=newLink;
        newLink.next=current;
    }

    public Link remove(){                          // удаление первого элемента
        Link temp = first;                         // сохранение ссылки
        first=first.next;
        return temp;                               // метод возвращает ссылку
    }

    public void displayList(){
        System.out.println("Link (first-->last): ");
        Link current=first;
        while(current!=null){
            current.displayLink();
            current=current.next;
        }
        System.out.println();
    }
}
