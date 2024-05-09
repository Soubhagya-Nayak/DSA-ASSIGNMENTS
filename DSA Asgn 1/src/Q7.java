public class Q7 {
    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }
    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            min = Math.min(min, num);
        }
        return min;
    }
    private static int countOccurrences(int[] arr, int element) {
        int count = 0;
        for (int num : arr) {
            if (num == element) {
                count++;
            }
        }
        return count;
    }
    private static int findFirstPosition(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1; // Element not found
    }
    private static int findLastPosition(int[] arr, int element) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1; // Element not found
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 2};

        int maxElement = findMax(arr);
        int minElement = findMin(arr);

        int maxCount = countOccurrences(arr, maxElement);
        int minCount = countOccurrences(arr, minElement);

        int firstMaxPos = findFirstPosition(arr, maxElement);
        int lastMinPos = findLastPosition(arr, minElement);

        System.out.println("Maximum element: " + maxElement);
        System.out.println("Minimum element: " + minElement);
        System.out.println("Count of maximum element: " + maxCount);
        System.out.println("Count of minimum element: " + minCount);
        System.out.println("First position of maximum element: " + firstMaxPos);
        System.out.println("Last position of minimum element: " + lastMinPos);
    }
}
