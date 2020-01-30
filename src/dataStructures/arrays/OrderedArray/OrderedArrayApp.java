package dataStructures.arrays.OrderedArray;

public class OrderedArrayApp {
    public static void main(String[] args) {
        OrderedArray orA = new OrderedArray(100);
        orA.insert(10);
        orA.insert(10);
        orA.insert(25);
        orA.insert(38);
        orA.insert(99);
        orA.insert(165);
        orA.insert(37);
        orA.insert(197);
        orA.insert(679);
        orA.insert(1173);

        orA.display();

        boolean one = orA.find(37);
        boolean two = orA.find(39);
        System.out.println(one);
        System.out.println(two);

        int searchKey = 165;
        if(orA.findBin(searchKey)!=orA.size())
            System.out.println("Found "+searchKey);
        else
            System.out.println("Can't find "+searchKey);
        orA.insert(79);
        orA.insert(97);
        orA.insert(2354789);
        orA.display();
        orA.delete(10);
        orA.delete(38);
        orA.delete(99);
        orA.display();

    }
}
