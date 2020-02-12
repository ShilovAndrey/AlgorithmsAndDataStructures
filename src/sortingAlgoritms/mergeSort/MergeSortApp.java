package sortingAlgoritms.mergeSort;

public class MergeSortApp {
    public static void main(String[] args) {

        int maxSize = 100;                   // размер массива
        DArray arr = new DArray(maxSize);    // создание массива и присвоение ссылки

        arr.insert(65);                // вставка элементов
        arr.insert(35);
        arr.insert(97);
        arr.insert(12);
        arr.insert(367);
        arr.insert(651);
        arr.insert(0);
        arr.insert(1);
        arr.insert(7);
        arr.insert(647);
        arr.insert(951);
        arr.insert(81);

        arr.display();                       // вывод содержимого массива

        arr.mergeSort();                     // сортировка слиянием

        arr.display();                       // вывод содержимого массива
    }
}
