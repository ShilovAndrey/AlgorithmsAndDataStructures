package sortingAlgoritms.bubbleSort;

public class BubbleSortApp {
    public static void main(String[] args) {
        ArrayBub arr = new ArrayBub(20);
        arr.insert(20);
        arr.insert(7);
        arr.insert(93);
        arr.insert(956);
        arr.insert(27);
        arr.insert(137);
        arr.insert(69);
        arr.insert(79);
        arr.insert(91);
        arr.insert(173);
        arr.insert(215);
        arr.insert(379);
        arr.insert(697);
        arr.insert(150);
        arr.insert(21);
        arr.insert(177);
        arr.display();
        arr.bubbleSort();
        arr.display();
    }
}
