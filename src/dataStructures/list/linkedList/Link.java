package dataStructures.list.linkedList;

public class Link {
    public long data;
    public Link next;
    public Link previous;

    public Link(long d) {
        data = d;
    }

    public void displayLink() {
        System.out.print("{" + data + "}");
    }
}
