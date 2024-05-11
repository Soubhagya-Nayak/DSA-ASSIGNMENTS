import java.util.*;

public class Q8 {
    public static void main(String Args[]) {
        Scanner dk = new Scanner(System.in);
        System.out.println("For x to the power n (First enter x then enter n):  ");
        int x = dk.nextInt();
        int n = dk.nextInt();
        int fact = mul(x, n);
        System.out.println("The x to the power n = " + fact);

    }

    public static int mul(int x, int y) {
        if (x == 0)
            return 0;
        else if (y == 0)
            return 1;
        else {
            int f = x * mul(x, y - 1);
            return f;
        }
    }
}