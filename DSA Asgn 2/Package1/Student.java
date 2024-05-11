package Package1;

import java.util.Scanner;
public class Student{
    String name;
    int roll;
    public void inputDetails(){
        Scanner dk = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = dk.nextLine();
        System.out.print("Enter roll: ");
        roll = dk.nextInt();
    }
    public void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
    }
}
