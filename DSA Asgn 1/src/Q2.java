import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner dk = new Scanner(System.in);
        System.out.print("Enter Weight: ");
        double w = dk.nextDouble();
        System.out.print("Enter Height: ");
        double h = dk.nextDouble();
        double bmi = w / (h*h);
        if (bmi <= 18.5)
            System.out.println("Underweight");
        else if (bmi > 18.5 && bmi <= 24.9)
            System.out.println("Normal Weight");
        else if (bmi > 25.0 && bmi <= 29.9)
            System.out.println("OverWeight");
        else if (bmi > 30.0)
            System.out.println("Obese");
    }
}
