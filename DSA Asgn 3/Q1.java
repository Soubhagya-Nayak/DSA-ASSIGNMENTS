import java.util.*;

public class Q1 {
    public static void main(String[] Args) {
        Scanner dk = new Scanner(System.in);
        System.out.print("Enter your lucky number: ");
        int n = dk.nextInt();
        try {
            if (n < 0)
                throw new NumberFormatException("Lucky number cannot be -ve ");
            else
                System.out.println("Your lucky number is = " + n);
        } catch (Exception e) {
            System.out.println(e);
        }
        dk.close();
    }
}