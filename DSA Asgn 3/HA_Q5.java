import java.util.*;

public class HA_Q5 {
    public static String reverse(String str) {
        if (str.isEmpty())
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner dk = new Scanner(System.in);
        System.out.println("The the sentence");
        String str = dk.nextLine();
        System.out.println("String obtained after being reversed " + reverse(str));
    }

}