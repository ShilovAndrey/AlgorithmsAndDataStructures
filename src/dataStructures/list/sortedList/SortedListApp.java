package dataStructures.list.sortedList;

public class SortedListApp {
    public static void main(String[] args) {
        SortedList theList = new SortedList();  // создание нового списка

        theList.insert(10);              // вставка элементов
        theList.insert(5);
        theList.insert(397);
        theList.insert(12);
        theList.insert(159);

        theList.displayList();                 // вывод содержимого списка

        theList.remove();                      // удаление элемента

        theList.displayList();                 // вывод содержимого списка
    }
}
