package Package2;
import Package1.*;
interface Sports{
    int score1 = 56;
    int score2 = 36;
}
public class Q8 {
    public static void main(String[] args) {
        Student s = new Student();
        s.inputDetails();
        s.showDetails();

        Test t = new Test();
        t.inputDetails();
        t.showDetails();

        int grandTotal = t.mark1+t.mark2+Sports.score1+Sports.score2;
        System.out.println("Grand Total: "+grandTotal);
    }
}
