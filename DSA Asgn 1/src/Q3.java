import java.util.Scanner;

public class Q3 {
    public static boolean spyNumber(int n) {
        int sum = 0, product = 1;
        while(n != 0){
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }
    public static void main(String[] args) {
        Scanner dk = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = dk.nextInt();
        if (spyNumber(num))
            System.out.println(num+" is a spy number.");
        else
            System.out.println(num+" is not a spy number.");
    }
}
