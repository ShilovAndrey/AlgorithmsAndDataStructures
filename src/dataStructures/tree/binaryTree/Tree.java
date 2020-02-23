package dataStructures.tree.binaryTree;

import java.util.Stack;

public class Tree {

    private Node root;                         // первый узел дерева

    public Tree() {                            // конструктор
        root = null;                           // пока нет ни одного узла
    }

    public Node find(int key) {                // поиск узла с указанным ключом (предполагается, что дерево не пустое)
        Node current = root;                   // начать с корневого узла
        while (current.iData != key) {         // пока не найдено совпадение

            if (key < current.iData)
                current = current.leftChild;   // переход налево
            else
                current = current.rightChild;  // переход направо
            if (current == null)               // если потомка нет
                return null;                   // поиск завершен
        }
        return current;                        // элемент найден
    }

    public void insert(int id, double dd) {
        Node newNode = new Node();                // создание нового узла
        newNode.iData = id;                       // вставка данных
        newNode.dData = dd;
        if (root == null)                         // корневой узел не существует
            root = newNode;
        else {                                    // корневой узел занят
            Node current = root;                  // начать с корневого узла
            Node parent;
            while (true) {                        // (внутрениий выход из цикла)
                parent = current;
                if (id < current.iData) {         // переход налево?
                    current = current.leftChild;
                    if (current == null) {        // если достигнут конец цепочки
                        parent.leftChild = newNode;  // вставить слева
                        return;
                    }
                } else {                              // или направо?
                    current = current.rightChild;
                    if (current == null) {            // если достигнут конец цепочки
                        parent.rightChild = newNode;  // вставить справа
                        return;
                    }
                }
            }
        }
    }

    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        while (current.iData != key) {
            parent = current;
            if (key < current.iData) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null)
                return false;
        }
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root)
                root = null;
            else if (isLeftChild)
                parent.leftChild = null;
            else
                parent.rightChild = null;
        }
        if (current.rightChild == null) {
            if (current == root)
                root = current.leftChild;
            else if (isLeftChild)
                parent.leftChild = current.leftChild;
            else
                parent.rightChild = current.leftChild;
        } else if (current.leftChild == null) {
            if (current == root)
                root = current.rightChild;
            else if (isLeftChild)
                parent.leftChild = current.rightChild;
            else
                parent.rightChild = current.rightChild;
        } else {                       // два потомка, узел заменяется приемником
            Node successor = getSuccessor(current);
            if (current == root)
                root = successor;
            else if (isLeftChild)
                parent.leftChild = successor;
            else
                parent.rightChild = successor;
            successor.leftChild = current.leftChild;
        }
        return true;
    }

    // метод возвращает узел со следубщим значением после delNode
    // для этого он сначала переходит к правому потомку, а затем отслеживает цепочку левых потомков этого узла
    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node succesor = delNode;
        Node current = delNode.rightChild;
        while (current != null) {
            successorParent = succesor;
            succesor = current;
            current = current.leftChild;
        }
        if (succesor != delNode.rightChild) {
            successorParent.leftChild = succesor.rightChild;
            succesor.rightChild = delNode.rightChild;
        }
        return succesor;
    }

    public void traverse(int traberseType) {
        switch (traberseType) {
            case 1:
                System.out.print("\n Preorder traversal: ");
                preOrder(root);
                break;
            case 2:
                System.out.print("\n Inorder traversal: ");
                inOrder(root);
                break;
            case 3:
                System.out.print("\n Posteorder traversal: ");
                postOrder(root);
                break;
        }
        System.out.println();
    }

    private void preOrder(Node localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.iData + " ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

    private void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.iData + " ");
            inOrder(localRoot.rightChild);
        }
    }

    private void postOrder(Node localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.iData + " ");
        }
    }

    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println(".........................................");
        while (isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for (int j = 0; j < nBlanks; j++)
                System.out.print(' ');
            while (globalStack.isEmpty() == false) {
                Node temp = (Node) globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.iData);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);

                    if (temp.leftChild != null || temp.rightChild != null)
                        isRowEmpty = false;
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < nBlanks * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            nBlanks /= 2;
            while (localStack.isEmpty() == false)
                globalStack.push(localStack.pop());
        }
        System.out.println("..................................");
    }
}

