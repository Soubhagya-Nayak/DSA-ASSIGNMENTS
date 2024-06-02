import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner dk = new Scanner(System.in);
        System.out.print("Enter the length of row: ");
        int r = dk.nextInt();
        System.out.print("Enter the length of coloumn: ");
        int c = dk.nextInt();

        int arr[][] = new int[r][c];
        System.out.print("Enter " + r * c + " elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = dk.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of the elements of this Array: " + sum);
    }
}
