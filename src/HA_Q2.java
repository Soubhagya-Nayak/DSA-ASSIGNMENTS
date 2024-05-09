import java.util.*;
class Book{
    String BName;
    int BEdition;
    int BPrice;
    Book(String bn, int be, int bp){
        this.BName = bn;
        this.BEdition = be;
        this.BPrice = bp;
    }
    void display(){
        System.out.println("Book Name: "+BName+", Book Edition: "+BEdition+", Book Price: "+BPrice);

    }
}
public class HA_Q2 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Calculus", 7, 2300));
        books.add(new Book("IGT", 6, 400));
        books.add(new Book("ITW", 5, 567));
        books.add(new Book("DSA", 3, 2034));
        books.add(new Book("UPEM", 15, 890));

        Book maxPrice = books.get(0);
        for (int i = 1; i < books.size(); i++) {
            if (books.get(i).BPrice > maxPrice.BPrice) {
                maxPrice = books.get(i);
            }
        }
        System.out.print("Book with Maximum Price: ");
        maxPrice.display();
    }
}
