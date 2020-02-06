package dataStructures.queue.basedOnArray.normalQueue;

public class Queue {
    private int maxSize;
    private long[] queArray;
    private int rear;
    private int front;
    private int nItems;

    public Queue(int size) {                 // конструктор
        maxSize = size;
        queArray = new long[maxSize];
        rear = -1;
        front = 0;
        nItems = 0;
    }

    public void insert(long element) {       // вставка элемента в конец очереди
        if (rear == maxSize - 1)             // циклический перенос
            rear = -1;
        queArray[++rear] = element;          // увеличение rear и вставка
        nItems++;                            // увеличение количества элементов
    }

    public long remove() {                   // извлечение элемента в начале очереди
        long temp = queArray[front++];       // выборка и увеличение front
        if (front == maxSize)                // циклический перенос
            front = 0;
        nItems--;                            // уменьшение количества элементов
        return temp;
    }

    public long peekFront() {                // чтение элемента в начале очереди
        return queArray[front];
    }

    public boolean isEmpty() {               // true, если очередь пуста
        return (nItems == 0);
    }

    public boolean isFull() {                // true, если очередь заполнена
        return (nItems == maxSize - 1);
    }

    public int size() {                      // количество элементов в очереди
        return nItems;
    }
}
