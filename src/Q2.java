import java.util.Scanner;
class Complex{
    double real;
    double img;
    void setData(){
        Scanner dk = new Scanner(System.in);
        System.out.print("Enter the real and img: ");
        real = dk.nextDouble();
        img = dk.nextDouble();
    }
    void display(){
        System.out.println(real+"+"+img+"i");
    }
    public Complex add(Complex obj1, Complex obj2){
        Complex obj3 = new Complex();
        obj3.real = obj1.real+obj2.real;
        obj3.img = obj1.img+obj2.img;
        return obj3;
    }
}
public class Q2{
    public static void main(String[] args) {
        Complex obj1 = new Complex();
        obj1.setData();

        Complex obj2 = new Complex();
        obj2.setData();

        obj1.display();
        obj2.display();

        Complex obj3 = new Complex();
        obj3 = obj3.add(obj1,obj2);
        obj3.display();
    }
}
