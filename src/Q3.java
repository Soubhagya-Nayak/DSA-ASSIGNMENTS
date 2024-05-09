class Product {
    int proId;
    double price;
    int quantity;
    static double totalPrice;
    Product(int proId, double price, int quantity) {
        this.proId = proId;
        this.price = price;
        this.quantity = quantity;
        totalPrice = quantity*price;
    }
    public static double sum(){
        return totalPrice;
    }
    void display(){
        System.out.println("Product Id: "+proId+", Quantity: "+quantity+", Price: "+price);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Product dk = new Product(12,350,3);
        Product dk1 = new Product(13,400,5);
        Product dk2 = new Product(14,450,2);
        Product dk3 = new Product(15,500,1);
        Product dk4 = new Product(16,200,6);

        System.out.println("Product 1: ");
        dk.display();
        System.out.println("Product 2: ");
        dk1.display();
        System.out.println("Product 3: ");
        dk2.display();
        System.out.println("Product 4: ");
        dk3.display();
        System.out.println("Product 5: ");
        dk4.display();
        System.out.println("--------------------------------------------");

        System.out.println("Total amount to pay: "+Product.sum());
    }
}
