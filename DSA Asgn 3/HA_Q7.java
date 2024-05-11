import java.util.*;

public class HA_Q7 {
    public static void unsort(int arr[], int k, int m, int n) {
        if (m < n) {
            if (arr[m] < k)
                m++;
            else if (arr[n] > k)
                n--;
            else if (arr[n] == arr[m])
                m++;
            else {
                int t = arr[m];
                arr[m] = arr[n];
                arr[n] = t;
            }
            unsort(arr, k, m, n);
        }
    }

    public static void main(String[] args) {
        Scanner dk = new Scanner(System.in);
        System.out.println("Enter size of array");
        int g = dk.nextInt();
        int arr[] = new int[g];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = dk.nextInt();
        }

        System.out.println("Enter number to divide groups ");
        int k = dk.nextInt();
        unsort(arr, k, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}