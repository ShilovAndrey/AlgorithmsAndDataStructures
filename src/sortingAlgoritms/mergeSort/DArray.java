package sortingAlgoritms.mergeSort;

public class DArray {

    private long[] theArray;
    private int nElements;

    public DArray(int size) {
        theArray = new long[size];
        nElements = 0;
    }

    public void insert(long value) {
        theArray[nElements] = value;
        nElements++;
    }

    public void display() {
        {
            for (int i = 0; i < nElements; i++)
                System.out.print(theArray[i] + " ");
        }
        System.out.println();
    }

    public void mergeSort() {                                         // вызывается из main()
        long[] workSpace = new long[nElements];                       // создание рабочей области
        recMergeSort(workSpace, 0, nElements - 1);
    }

    private void recMergeSort(long[] workSpace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound)                                   // если только один элемент
            return;                                                     // сортировка не проводится
        else {
            int middle = (lowerBound + upperBound) / 2;                 // поиск середины
            recMergeSort(workSpace, lowerBound, middle);                // сортировка нижней половины
            recMergeSort(workSpace, middle + 1, upperBound); // сортировка верхней половины
            merge(workSpace, lowerBound, middle + 1, upperBound); // слияние
        }
    }

    private void merge(long[] workSpace, int lowPtr, int highPtr, int upperBound) {
        int j = 0;                                          // индекс в рабочей области
        int lowerBound = lowPtr;
        int middle = highPtr - 1;
        int n = upperBound - lowerBound + 1;                // количество элементов

        while (lowPtr <= middle && highPtr <= upperBound) {
            if (theArray[lowPtr] < theArray[highPtr])
                workSpace[j++] = theArray[lowPtr];
            else
                workSpace[j++] = theArray[highPtr];
        }
        while (lowPtr <= middle)
            workSpace[j++] = theArray[lowPtr++];
        while (highPtr <= upperBound)
            workSpace[j++] = theArray[highPtr];

        for (j = 0; j < n; j++)
            theArray[lowerBound + j] = workSpace[j];
    }
}
