package dataStructures.queue.basedOnLinkedList;

public class LinkQueueApp {
    public static void main(String[] args) {
        LinkQueue theQueue = new LinkQueue();

        theQueue.insert(20);      // вставка элементов
        theQueue.insert(40);

        theQueue.displayQueue();        // вывод содержимого очереди

        theQueue.insert(60);      // вставка элементов
        theQueue.insert(80);

        theQueue.displayQueue();        // вывод содержимого очереди

        theQueue.remove();              // удаление элементов
        theQueue.remove();

        theQueue.displayQueue();        // вывод содержимого очереди
    }
}
