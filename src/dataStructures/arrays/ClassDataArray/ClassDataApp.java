package dataStructures.arrays.ClassDataArray;

public class ClassDataApp {
    public static void main(String[] args) {
        ClassDataArray arr = new ClassDataArray(100);
        arr.insert("Adam","Jensen",38);
        arr.insert("Hank","Moody",45);
        arr.insert("Fox","Molder",32);
        arr.insert("Keanu","Reaves",55);
        arr.insert("Kimi","Raikkonen",41);
        arr.insert("Andrey","Shilov",31);
        arr.insert("Frank","Pritchard",43);
        arr.insert("David","Sarif",53);
        arr.insert("David","Backhem",45);
        arr.insert("Ian","Somerholder",41);
        System.out.print("We are looking for ");
        Person search = arr.find("Jensen");
        System.out.println(search);
        System.out.println();
        arr.display();
        System.out.println();
        arr.delete("Somerholder");
        arr.delete("Sarif");
        arr.delete("Reaves");
        arr.display();


    }
}
