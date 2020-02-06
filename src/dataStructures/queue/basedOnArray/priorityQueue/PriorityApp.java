package dataStructures.queue.basedOnArray.priorityQueue;

public class PriorityApp {

    public static void main(String[] args) {

        PriorityQueue priorityQueue = new PriorityQueue(5);

        priorityQueue.insert(10);
        priorityQueue.insert(367);
        priorityQueue.insert(97);
        priorityQueue.insert(1956);
        priorityQueue.insert(7);

        while (!priorityQueue.isEmpty()) {
            long temp = priorityQueue.remove();
            System.out.print(temp + " ");
        }
        System.out.println();
    }
}
