package dataStructures.stack.normalStack;

public class StackApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(10);  // создание стека
        theStack.push(10);       // занесение элементов в стек
        theStack.push(30);
        theStack.push(50);
        theStack.push(70);
        theStack.push(90);
        long value = theStack.peek();  // чтение верхнего элемента
        System.out.println(value);
        while(!theStack.isEmpry()){    // пока стек не станет пустым
            long temp = theStack.pop();// удалить элемент из стека
            System.out.print(temp);    // вывод содержимого
            System.out.print(" ");
        }
    }
}
