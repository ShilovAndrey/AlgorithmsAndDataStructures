package dataStructures.heap;

import java.io.IOException;
import java.util.Scanner;

public class HeapApp {
    public static void main(String[] args) throws IOException {
        int value1;
        int value2;
        boolean success;
        Heap theHeap = new Heap(31);
        theHeap.insert(70);
        theHeap.insert(40);
        theHeap.insert(50);
        theHeap.insert(20);
        theHeap.insert(60);
        theHeap.insert(100);
        theHeap.insert(80);
        theHeap.insert(30);
        theHeap.insert(10);
        theHeap.insert(90);

        while (true) {
            System.out.print("Enter first letter of ");
            System.out.print("show, insert, remove, change: ");
            char choice = getChar();
            switch (choice) {
                case 's':
                    theHeap.displayHeap();
                    break;
                case 'i':
                    System.out.println("Enter value to insert: ");
                    value1 = getInt();
                    success = theHeap.insert(value1);
                    if (!success)
                        System.out.println("Can't insert: heap is full");
                    break;
                case 'r':
                    if (!theHeap.isEmpty())
                        theHeap.remove();
                    else
                        System.out.println("Can't remove: heap is empty");
                    break;
                case 'c':
                    System.out.println("Enter current index of item: ");
                    value1 = getInt();
                    System.out.println("Enter new key: ");
                    value2 = getInt();
                    success = theHeap.change(value1, value2);
                    if (!success)
                        System.out.println("Invalid index");
                    break;
                default:
                    System.out.println("Invalid entry\n");
            }
        }
    }

    public static String getString() throws IOException {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        return line;
    }

    public static char getChar() throws IOException {
        String line = getString();
        return line.charAt(0);
    }

    public static int getInt() throws IOException {
        String line = getString();
        return Integer.parseInt(line);
    }
}
