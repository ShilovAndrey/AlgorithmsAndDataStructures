package dataStructures.stack.basedOnArray.bracketsTask;

import java.util.Scanner;

public class BracketApp {
    public static void main(String[] args) {
        String line;
        while(true){
            System.out.println("Введите строку для обработки");
            line=getString();                                  // чтение строки с клавиатуры
            if(line.equals(""))                                // завершение, если нажат Enter
                break;
            BracketChecker checker = new BracketChecker(line); // создание объекта BracketChecker
            checker.check();                                   // проверка парных скобок
        }
    }
    private static String getString() {
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        return data;
    }
}
