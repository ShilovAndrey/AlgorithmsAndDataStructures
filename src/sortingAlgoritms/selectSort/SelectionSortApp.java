package sortingAlgoritms.selectSort;

public class SelectionSortApp {

    public static void main(String[] args) {
        ArraySel arr = new ArraySel(15);
        arr.insert(15);
        arr.insert(1);
        arr.insert(93);
        arr.insert(978);
        arr.insert(364);
        arr.insert(47);
        arr.insert(37);
        arr.insert(875);
        arr.insert(1735);
        arr.insert(355);
        arr.insert(179);
        arr.display();
        arr.selectionSort();
        arr.display();
    }
}
