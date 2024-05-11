import java.util.*;

public class HA_Q3 {
    public static void main(String Args[]) {
        Scanner dk = new Scanner(System.in);
        System.out.println("Enter the number whose binary you wnat to find ");
        int n = dk.nextInt();
        String binary = binary(n, "");
        System.out.println("The binary is = " + binary);
    }

    public static String binary(int n, String bin) {
        if (n == 0)
            return bin;
        else {
            int r = n % 2;
            bin = r + bin;
            return binary(n / 2, bin);

        }
    }
}