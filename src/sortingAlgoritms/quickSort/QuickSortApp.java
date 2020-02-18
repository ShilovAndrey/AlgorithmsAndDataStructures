package sortingAlgoritms.quickSort;

public class QuickSortApp {
    public static void main(String[] args) {
        int maxSize=16;
        ArrayIns arr;
        arr=new ArrayIns(maxSize);

        for(int i=0;i<maxSize;i++){
            long n = (long)(Math.random()*99);
            arr.insert(n);
        }
        arr.display();          // вывод элементов
        arr.quickSort();        // быстрая сортировка
        arr.display();          // повторный вывод
    }
}
