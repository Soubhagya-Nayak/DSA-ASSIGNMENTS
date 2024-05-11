class Commission{
    int sales;
    double commission;
    Commission(int sales){
        this.sales = sales;
    }
    void getCommission(){
        if (sales < 100){
            commission = (sales)*2.0/100;
        } else if (sales > 100 && sales <5000) {
            commission = (sales)*5.0/100;
        } else {
            commission = (sales)*8.0/100;
        }
    }
}

public class HA_Q1 {
    public static void main(String[] args) {
        Commission c = new Commission(6000);
        if (c.sales < 0) {
            System.out.println("Invalid Input");
        }
        else {
            c.getCommission();
            System.out.println("Commission :"+c.commission);
        }
    }
}
