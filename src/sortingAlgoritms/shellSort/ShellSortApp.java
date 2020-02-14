package sortingAlgoritms.shellSort;


public class ShellSortApp {
    public static void main(String[] args) {

        int size = 10;                              //  размер массива
        ArraySh theArray = new ArraySh(size);       // создание массива

        for (int i = 0; i < size; i++) {            // заполнение массива
            long n = (long) (Math.random() * 99);
            theArray.insert(n);
        }

        theArray.display();              // вывод несортированного массива

        theArray.shellSort();            // сортировка массива по алгоритму Шелла

        theArray.display();              // вывод отсортированного массива
    }
}
