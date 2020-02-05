package dataStructures.stack.basedOnLinkedList;

public class LinkList {
    private Link first;                   // ссылка на первый элемент в списке

    public LinkList() {                   // конструктор
        first = null;                     // список пока не содержит элементов
    }

    public boolean isEmpty() {            // true, если список пуст
        return (first == null);
    }

    public void insertFirst(long value) { // вставка элемента в начало списка
        Link newLink = new Link(value);   // создание нового элемента
        newLink.next = first;             // newLink --> старое значение first
        first = newLink;                  // first --> newLink
    }

    public long deleteFirst() {           // удаление первого элемента (предполагается, что список не пуст)
        Link temp = first;                // сохранение ссылки
        first = first.next;               // удаление: first --> ссылка на второй элемент
        return temp.data;                 // метод возвращает данные удаленного элемента
    }

    public void displayList() {
        Link current = first;             // от начала списка
        while (current != null) {         // перемещение до конца списка
            current.displayLink();        // вывод данных
            current = current.next;       // переход к следующему элементу
        }
        System.out.println();
    }
}
