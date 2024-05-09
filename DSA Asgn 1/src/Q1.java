import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner dk = new Scanner(System.in);
        System.out.print("Enter a positive number greater than 2: ");
        int num = dk.nextInt();
        int count = 0;
        while (num > 2) {
            num /= 2;
            count++;
        }
        System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is " + count);
    }
}
