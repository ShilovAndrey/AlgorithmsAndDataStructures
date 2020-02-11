package recursion;

import java.util.ArrayList;

public class RecOne {

    private ArrayList<Integer> list;

    public RecOne() {
        list = new ArrayList<>();
    }

    public void displayList() {                           // выводим содержимое списка
        for (Integer a : list) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public void fillInArray(int size) {                  // заполняем список элементами
        for (int i = 0; i < size; i++) {
            int value = (int) (Math.random() * 1000);
            list.add(value);
        }
    }

    public int factorial(int f) {                        // находим факториал переданного числа
        if (f == 0)
            return 1;
        else
            return f * factorial(f - 1);
    }

    public void count(int num) {                        // обратный отсчет от переданного числа
        if (num < 1)
            System.out.println("Старт!");
        else {
            System.out.println(num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            count(num - 1);
        }
    }

    public int sumList() {                         // возвращаем сумму всех элементов списка

        if (list.isEmpty())                        // если список пуст - возвращаем 0
            return 0;
        else {
            int x = list.get(0);                   // сохраняем первый элемент списка
            list.remove(0);
            return x + sumList();                  // рекурсия
        }
    }

    public int max() {                             // возвращаем наибольший элемент списка
        if (list.isEmpty())
            return 0;
        if (list.size() == 2) {                    // базовое условие
            if (list.get(0) > list.get(1)) {
                int x = list.get(0);
                return x;
            } else {
                int y = list.get(1);
                return y;
            }
        }
        if (list.get(0) > list.get(1)) {
            list.remove(1);
            int i = max();
            return i;
        } else {
            list.remove(0);
            int j = max();
            return j;
        }
    }
}
