package arrays.ClassDataArray;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public Person(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    public void displayPerson(){
        System.out.println("First Name: " +firstName + " last Name: "+lastName+" age: "+age );
    }
    public String getLast(){
        return lastName;
    }
    public String toString(){
        return (lastName+" " + firstName + " " + age);
    }
}
