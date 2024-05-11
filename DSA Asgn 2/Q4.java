class Deposit{
    long principle;
    int time;
    double rate;
    double totalAmt;
    Deposit(){
        System.out.println("Please Enter Some Data.");
    }
    Deposit(long principle, int time, double rate){
        this.principle = principle;
        this.time = time;
        this.rate = rate;
        calcAmt();
    }
    Deposit(long principle, int time){
        this.principle = principle;
        this.time = time;
        rate = 0.0;
    }
    Deposit(long principle, double rate){
        this.principle = principle;
        this.rate = rate;
        time = 0;
    }

    void display(){
        System.out.println("Principle: "+principle+", Time: "+time+", Rate: "+rate);
        System.out.println("Total amount: "+totalAmt);
    }
    public void calcAmt(){
        totalAmt = principle + (principle * rate * time) / 100;
    }
}
public class Q4 {
    public static void main(String[] args) {
        Deposit dk1 = new Deposit();
        dk1.display();

        Deposit dk2 = new Deposit(1000, 2, 5.0);
        dk2.display();

        Deposit dk3 = new Deposit(2000, 3);
        dk3.display();

        Deposit dk4 = new Deposit(3000, 4.5);
        dk4.display();

    }
}
