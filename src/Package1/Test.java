package Package1;
import java.util.Scanner;
public class Test extends Student {
    public int mark1;
    public int mark2;
    public void inputDetails(){
        Scanner dk = new Scanner(System.in);
        System.out.print("Enter mark1: ");
        mark1 = dk.nextInt();
        System.out.print("Enter mark2: ");
        mark2 = dk.nextInt();
    }
    public void showDetails(){
        System.out.println("Mark1: "+mark1);
        System.out.println("Mark2: "+mark2);
    }
}