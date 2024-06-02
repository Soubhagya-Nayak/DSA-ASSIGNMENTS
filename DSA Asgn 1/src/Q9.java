import java.util.Scanner;

public class Q9 {
    public static double sumOfDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner dk = new Scanner(System.in);
        double arr[][] = new double[4][4];
        System.out.print("Enter elements of 4-by-4 matrix: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = dk.nextDouble();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Sum of the Diagonal elements of this Array: " + sumOfDiagonal(arr));
    }
}
