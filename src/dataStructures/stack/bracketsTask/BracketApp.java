package dataStructures.stack.bracketsTask;

import java.util.Scanner;

public class BracketApp {
    public static void main(String[] args) {
        String line;
        while(true){
            System.out.println("Введите строку для обработки");
            line=getString();
            BracketChecker checker = new BracketChecker(line);
            checker.check();
        }
    }
    private static String getString() {
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        return data;
    }
}
