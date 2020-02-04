package dataStructures.queue.priorityQueue;

public class PriorityQueue {           // элементы массива сортируются по значению ключа, от максимума (0)
                                       // до минимума (maxSize-1)
    private int maxSize;
    private long[] queueArray;
    private int nItems;

    public PriorityQueue(int size) {               // конструктор
        maxSize = size;
        queueArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long element) {             // вставка элемента
        if (nItems == 0)                           // если очередь пуста,
            queueArray[nItems++] = element;        // вставляем в ячейку 0
        else {                                     // если содержит элементы
            int i;
            for (i = nItems - 1; i >= 0; i--) {          // перебор в обратном направлении
                if (element > queueArray[i])             // если новый элемент больше,
                    queueArray[i + 1] = queueArray[i];   // сдвинуть вверх
                else                                     // если меньше,
                    break;                               // сдвиг прекращается
            }
            queueArray[i + 1] = element;                 // вставка элемента
            nItems++;
        }
    }

    public long remove() {                         // извлечение минимального элемента
        return queueArray[--nItems];
    }

    public long peekMin() {                       // чтение минимального элемента
        return queueArray[nItems - 1];
    }

    public boolean isEmpty() {                    // true, если очередь пуста
        return (nItems == 0);
    }

    public boolean isFull() {                     // true, если очередь заполнена
        return (nItems == maxSize);
    }
}
