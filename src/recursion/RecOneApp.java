package recursion;

public class RecOneApp {
    public static void main(String[] args) {

        RecOne tester = new RecOne();
        tester.fillInArray(10);             // наполняем список
        tester.displayList();                    // выводим на экран
        System.out.println();

        int fac = tester.factorial(5);        // находим факториал
        System.out.println(fac);

        tester.count(3);                   // обратный отсчет

        int sum = tester.sumList();              // находим сумму элементов списка
        System.out.println(sum);

        System.out.println();

        tester.fillInArray(10);             // снова заполняем список
        tester.displayList();
        int max = tester.max();                  // находим максимальное значение элемента
        System.out.println(max);

    }
}
