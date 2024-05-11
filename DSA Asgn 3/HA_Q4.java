public class HA_Q4 {
    static int product(int x, int y) {
        if (x < y) {
            return product(y, x);
        }
        else if (y != 0) {
            return (x + product(x, y - 1));
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int x = 5, y = 2;
        System.out.println("Product of " + x + " and " + y + " is: " + product(x, y));
    }
}
