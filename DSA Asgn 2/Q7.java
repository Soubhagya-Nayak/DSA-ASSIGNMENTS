interface DetailInfo{
    void display();
    int count();
}
class Person2 implements DetailInfo{
    static int maxCount;
    String name;
    Person2(String name){
        this.name = name;
    }
    @Override
    public void display() {
        System.out.println("Name: "+name);
    }
    public int count(){
        return name.length();
    }
}
public class Q7 {
    public static void main(String[] args) {
        Person2 dk = new Person2("Soubhagya");
        Person2 dk1 = new Person2("Raj Prasad");
        dk.display();
        System.out.println("Number of Character in the name: "+dk.count());
        dk1.display();
        System.out.println("Number of Character in the name: "+dk1.count());
    }
}
