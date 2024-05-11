import java.util.*;
class Person{
    String name;
    int age;
    void setData(){
        Scanner dk = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = dk.nextLine();
        System.out.print("Enter your age: ");
        age = dk.nextInt();
        dk.close();
    }
    void displayData(){
        System.out.println("Name: "+name+", Age: "+age);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Person obj1 = new Person();
        obj1.name = "Rohan";
        obj1.age = 20;
        Person obj2 = new Person();
        obj2.setData();
        obj2.displayData();
        obj1.displayData();
        if (obj1.age < obj2.age) {
            System.out.println(obj1.name+" is younger than "+obj2.name);
        }
        else{
            System.out.println(obj2.name+" is younger than "+obj1.name);
        }
    }
}
