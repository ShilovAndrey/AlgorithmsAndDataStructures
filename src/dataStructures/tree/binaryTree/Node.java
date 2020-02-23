package dataStructures.tree.binaryTree;

public class Node {

    public int iData;                // данные, используемые в качестве ключа
    public double dData;             // другие данные
    public Node leftChild;           // левый потомок узла
    public Node rightChild;          // правый потомок узла

    public void displayNode() {      // вывод узла
        System.out.print("{");
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print("} ");
    }
}
