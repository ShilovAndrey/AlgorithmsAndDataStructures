package dataStructures.stack.basedOnLinkedList;

public class LinkStackApp {
    public static void main(String[] args) {
        LinkStack theStack = new LinkStack();  // создание стека

        theStack.push(20);               // вставка элементов
        theStack.push(40);

        theStack.displayStack();               // вывод содержимого стека

        theStack.push(60);               // вставка элементов
        theStack.push(80);

        theStack.displayStack();               // вывод содержимого стека

        theStack.pop();                        // извлечение элементов
        theStack.pop();

        theStack.displayStack();               // вывод содержимого стека
    }
}
