import java.util.*;

public class HA_Q8 {
    public static void tower(int i, char x, char y, char z) {
        if (i > 0) {
            tower(i - 1, x, z, y);
            System.out.print(x + " " + y);
            tower(i - 1, z, y, x);
        }
    }

    public static void main(String[] args) {
        Scanner dk = new Scanner(System.in);
        System.out.println("Enter the number of disc");
        int i = dk.nextInt();
        System.out.println("Assign the name of pegs respectively");
        char x = dk.next().charAt(0);
        char y = dk.next().charAt(0);
        char z = dk.next().charAt(0);
        tower(i, x, y, z);
    }
}