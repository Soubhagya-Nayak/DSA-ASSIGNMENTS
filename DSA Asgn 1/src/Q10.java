import java.util.Scanner;

public class Q10 {
    public static double sumColumn(double[][] m, int coloumnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][coloumnIndex];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner dk = new Scanner(System.in);
        double arr[][] = new double[3][4];
        System.out.print("Enter elements of 3-by-4 matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = dk.nextDouble();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        for (int j = 0; j < 4; j++) {
            System.out.println("Sum of the elements at column Index " + j + " is: " + sumColumn(arr, j));
        }
    }
}
