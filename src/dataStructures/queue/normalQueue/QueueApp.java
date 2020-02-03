package dataStructures.queue.normalQueue;

public class QueueApp {
    public static void main(String[] args) {
        Queue theQueue = new Queue(5);    // очередь из 5 ячеек

        theQueue.insert(10);           // вставка 4 элементов
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        theQueue.remove();                     // удаление 3 элементов (10,20,30)
        theQueue.remove();
        theQueue.remove();

        theQueue.insert(50);           // вставка еще 4 элементов
        theQueue.insert(60);           // (происходит циклический перенос)
        theQueue.insert(70);
        theQueue.insert(80);

        while (!theQueue.isEmpty()) {          // извлечение и вывод все элементов
            long temp = theQueue.remove();     // (40,50,60,70,80)
            System.out.print(temp + " ");
        }
        System.out.println();
    }
}
