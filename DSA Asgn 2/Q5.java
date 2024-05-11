class Person1 {
    String name;
    int age;
    Person1(String name, int age) {
        this.name = name;
        this.age = age;

    }
}
class Employee extends Person1 {
    int eid;
    double salary;
    Employee(String name, int age, int eid, double salary) {
        super(name, age);
        this.eid = eid;
        this.salary = salary;
    }
    void display(){
        System.out.println("Employee name: "+name+", Age: "+age+", Eid: "+eid+", Salary: "+salary);
    }
}
public class Q5 {
    public static void main(String[] args) {
        Employee em = new Employee("Soubhagya",18,4022,25000);
        em.display();
    }
}
