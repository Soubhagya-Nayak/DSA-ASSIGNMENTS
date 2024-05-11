import java.util.*;

public class Q9 {
    public static void main(String Args[]) {
        Scanner dk = new Scanner(System.in);
        System.out.print("Enter the number whose reverse to be done: ");
        int n = dk.nextInt();
        reverse(n);
    }

    public static void reverse(int x) {

        if (x == 0)
            return;
        else {
            System.out.print(x % 10);
            reverse(x / 10);
        }
    }
}