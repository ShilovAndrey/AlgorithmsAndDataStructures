package dataStructures.list.linkedList;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList theList = new LinkedList();   // создание нового списка

        theList.insertFirst(22);           // вставка в начале
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.insertLast(11);            // вставка в конце
        theList.insertLast(33);
        theList.insertLast(55);

        theList.displayForward();                // вывод в прямом направлении
        theList.displayBackWard();               // вывод в обратном направлении

        theList.deleteFirst();                   // удаление первого элемента
        theList.deleteLast();                    // удалени последнего элемента
        theList.deleteKey(11);                   // удаление элемента с ключом 11

        theList.displayForward();                // вывод в прямом направлении

        theList.insertAfter(22, 77);    // вставка 77 после 22
        theList.insertAfter(33, 88);    // вставка 88 после 33

        theList.displayForward();                // вывод в прямом направлении
    }
}
