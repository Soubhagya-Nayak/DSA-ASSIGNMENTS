import java.util.Scanner;

public class Q1b {
    public static void main(String[] args) {
        Scanner dk = new Scanner(System.in);
        System.out.print("Enter a positive number greater than 2: ");
        int num = dk.nextInt();
        int count = 0;
        for (int i = num; i < 2; i /= 10, count++);
        System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is " + count);
    }
}
