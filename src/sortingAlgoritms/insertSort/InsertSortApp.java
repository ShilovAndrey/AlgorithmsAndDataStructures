package sortingAlgoritms.insertSort;

public class InsertSortApp {
    public static void main(String[] args) {
        ArrayIns arr = new ArrayIns(20);
        arr.insert(5759);
        arr.insert(267);
        arr.insert(36);
        arr.insert(245);
        arr.insert(741);
        arr.insert(1);
        arr.insert(51);
        arr.insert(35);
        arr.insert(751);
        arr.insert(23);
        arr.insert(247);
        arr.insert(5647);
        arr.insert(521);
        arr.insert(471);
        arr.insert(951);
        arr.insert(10);
        arr.display();
        arr.insertionSort();
        arr.display();
    }
}
