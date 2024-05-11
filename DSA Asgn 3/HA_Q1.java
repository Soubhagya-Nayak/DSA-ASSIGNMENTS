import java.util.*;

public class HA_Q1 {
    public static void main(String Args[]) {
        Scanner dk = new Scanner(System.in);
        System.out.println("Enter the numbers whose GCD you want to take ");
        int a = dk.nextInt();
        int b = dk.nextInt();
        System.out.println("The GCD of two numbers are = " + GCD(a, b));
    }

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            int r = a % b;
            a = b;
            b = r;
            return GCD(a, b);
        }
    }
}