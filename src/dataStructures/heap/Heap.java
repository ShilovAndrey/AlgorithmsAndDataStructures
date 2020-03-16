package dataStructures.heap;

public class Heap {

    private Node[] heapArray;
    private int maxSize;
    private int currentSize;

    public Heap(int size) {
        maxSize = size;
        heapArray = new Node[maxSize];
        currentSize = 0;
    }

    public boolean isEmpty() {
        return (currentSize == 0);
    }

    public boolean insert(int key) {
        if (currentSize == maxSize)
            return false;
        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;
        trickleUp(currentSize++);
        return true;
    }

    private void trickleUp(int index) {
        Node bottom = heapArray[index];
        int parent = (index - 1) / 2;
        while (index > 0 && heapArray[parent].getKey() < bottom.getKey()) {
            heapArray[index] = heapArray[parent];
            index = parent;
            parent = (parent - 1) / 2;
        }
        heapArray[index] = bottom;
    }

    public Node remove() {
        Node temp = heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        trickleDown(0);
        return temp;
    }

    private void trickleDown(int index) {
        Node top = heapArray[index];
        int largeChild;
        while (index < currentSize / 2) {
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;
            if (rightChild < currentSize && heapArray[rightChild].getKey() > heapArray[leftChild].getKey())
                largeChild = rightChild;
            else
                largeChild = rightChild;
            if (top.getKey() >= heapArray[largeChild].getKey())
                break;
            heapArray[index] = heapArray[largeChild];
            index = largeChild;
        }
        heapArray[index] = top;
    }

    public boolean change(int index, int newValue) {
        if (index < 0 || index >= currentSize)
            return false;
        int oldValue = heapArray[index].getKey();
        heapArray[index].setKey(newValue);
        if (newValue < oldValue)
            trickleDown(index);
        else
            trickleUp(index);
        return true;
    }

    public void displayHeap() {
        System.out.print("heapArray: ");
        for (int m = 0; m < currentSize; m++)
            if (heapArray[m] != null)
                System.out.print(heapArray[m].getKey() + " ");
            else
                System.out.print("-- ");
        System.out.println();

        int nBlanks = 32;
        int itemsPerRow = 1;
        int column = 0;
        int j = 0;
        String dots = "...........................";
        System.out.println(dots + dots);

        while (currentSize > 0) {
            if (column == 0)
                for (int k = 0; k < nBlanks; k++)
                    System.out.print(' ');
            System.out.print(heapArray[j].getKey());
            if (++j == currentSize)
                break;
            if (++column == itemsPerRow) {
                nBlanks /= 2;
                itemsPerRow *= 2;
                column = 0;
                System.out.println();
            } else
                for (int k = 0; k < nBlanks * 2 - 2; k++)
                    System.out.print(' ');
        }
        System.out.println("\n" + dots + dots);
    }
}
