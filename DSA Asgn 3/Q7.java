import java.util.*;

public class Q7 {
    public static void main(String[] Args) {
        Scanner dk = new Scanner(System.in);
        System.out.print("Enter the number whose factorial you want to take: ");
        int n = dk.nextInt();
        int f = fact(n, 1);
        System.out.println("The factorial of the number is = " + f);
    }

    public static int fact(int n, int i) {
        if (n == i)
            return i;
        else {
            int f = i * fact(n, i + 1);
            return f;
        }
    }
}