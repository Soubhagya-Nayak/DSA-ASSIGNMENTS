import java.util.*;

public class Q2 {
    public static void main(String Args[]) {
        Scanner dk = new Scanner(System.in);
        try {
            String a[] = { "Red", "Green", "Blue", "Null", "Black" };
            System.out.print("Enter the colour number (0-4): ");
            int x = dk.nextInt();
            System.out.println("Color name length is  = " + a[x].length());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        dk.close();

    }
}