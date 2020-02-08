package dataStructures.list.linkedList;

public class LinkedList {
    private Link first;                       // ссылка на первый элемент списка
    private Link last;                        // ссылка на последний элемент списка

    public LinkedList() {                     // конструктор
        first = null;
        last = null;
    }

    public boolean isEmpty() {                // true, если список пуст
        return (first == null);
    }

    public void insertFirst(long value) {     // вставка элемента в начало списка
        Link newLink = new Link(value);       // создание нового элемента
        if (isEmpty())                        // если список не содержит элементов
            last = newLink;
        else
            first.previous = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long value) {      // вставка элемента в конец списка
        Link newLink = new Link(value);       // создание нового элемента
        if (isEmpty())                        // если список не содержит элементов
            first = newLink;
        else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    public Link deleteFirst() {               // удалени первого элемента (предполагается, что список не пуст)
        Link temp = first;
        if (first.next == null)               // если только один элемент
            last = null;
        else
            first.next.previous = null;
        first = first.next;
        return temp;
    }

    public Link deleteLast() {                // удаление последнего элемента
        Link temp = last;
        if (last.previous == null)            // если только один элемент
            first = null;
        else
            last.previous.next = null;
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(long key, long dd) {  // вставка dd в позицию после key
        Link current = first;                 // от начала списка
        while (current.data != key) {         // пока не будет найдено совпадение
            current = current.next;           // переход к следующему элементу
            if (current == null)
                return false;                 // ключ не найден
        }
        Link newLink = new Link(dd);
        if (current == last) {                // для последнего элемента списка
            newLink.next = null;
            last = newLink;
        } else {                              // не последний элемент списка
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;                          // ключ найден, вставка выполнена
    }

    public Link deleteKey(long key) {         // удаление элемента с заданным ключом
        Link current = first;                 // с начала списка
        while (current.data != key) {         // пока не будет найдено совпадение
            current = current.next;
            if (current == null)
                return null;                  // ключ не найден
        }
        if (current == first)                 // ключ найден, это первый элемент?
            first = current.next;
        else                                  // не первый элемент
            current.previous.next = current.next;
        if (current == last)                  // последний элемент?
            last = current.previous;
        else                                  // не последний элемент
            current.next.previous = current.previous;
        return current;
    }

    public void displayForward() {
        System.out.print("List (first==>last: ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }

    public void displayBackWard() {
        System.out.print("List (last==>first: ");
        Link current = last;
        while (current != null) {
            current.displayLink();
            current = current.previous;
        }
        System.out.println(" ");
    }
}
