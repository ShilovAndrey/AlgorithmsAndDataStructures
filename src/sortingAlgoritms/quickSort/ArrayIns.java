package sortingAlgoritms.quickSort;

public class ArrayIns {

    private long[] theArray;
    private int nElements;

    public ArrayIns(int max) {
        theArray = new long[max];
        nElements = 0;
    }

    public void insert(long value) {
        theArray[nElements] = value;
        nElements++;
    }

    public void display() {
        for (int i = 0; i < nElements; i++) {
            System.out.print(theArray[i] + " ");
        }
        System.out.println();
    }

    public void quickSort() {
        recQuickSort(0, nElements - 1);
    }

    private void recQuickSort(int left, int right) {
        int size = right - left + 1;
        if (size < 10)                                    // сортировка методом вставки
            insertionSort(left, right);                   // при малом размере
        else {                                            // быстрая сортировка, при большом размере
            long median = medianOf3(left, right);
            int partition = partitionIt(left, right, median);
            recQuickSort(left, partition - 1);
            recQuickSort(partition, right);
        }
    }

    private long medianOf3(int left, int right) {
        int center = (left + right) / 2;
        if (theArray[left] > theArray[center])           // упорялочение left и center
            swap(left, right);
        if (theArray[left] > theArray[right])            // упорялочение left и right
            swap(left, right);
        if (theArray[center] > theArray[right])          // упорялочение center и right
            swap(center, right);
        swap(center, right - 1);                         // размещение медианы на правом краю
        return theArray[right - 1];                      // метод возвращает медиану
    }

    private void swap(int dex1, int dex2) {              // перестановка 2 элементов
        long temp = theArray[dex1];
        theArray[dex1] = theArray[dex2];
        theArray[dex2] = temp;
    }

    private int partitionIt(int left, int right, long pivot) {
        int leftPtr = left;                              // справа от первого элемента
        int rightPtr = right - 1;                        // слева от опорного элемента
        while (true) {
            while (theArray[++leftPtr] < pivot) ;        // поиск большего элемента
            while (theArray[--rightPtr] > pivot) ;       // поиск меньшего элемента
            if (leftPtr >= rightPtr)                     // если указатели сошлись,
                break;                                   // разбиение завершено
            else                                         // в противном случае
                swap(leftPtr, rightPtr);                 // поменять элементы местами
        }
        swap(leftPtr, right - 1);                        // восстановление опорного элемента
        return leftPtr;                                  // позиция разбиения
    }

    private void insertionSort(int left, int right) {    // сортировка методо вставки
        int in, out;
        for (out = left + 1; out <= right; out++) {      // сортировка слева от out
            long temp = theArray[out];
            in = out;                                    // начать перемещения с out
            while (in > left && theArray[in - 1] > temp) {  // пока не найден меньший элемент
                theArray[in] = theArray[in - 1];            // сдвинуть элемент вправо
                in--;                                       // перейти на одну позицию влево
            }
            theArray[in] = temp;
        }
    }
}
