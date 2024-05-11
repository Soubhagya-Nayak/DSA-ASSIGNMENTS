abstract class Mark{
    int markICP;
    int markDSA;
    double percentage;
    abstract void getPercentage();
}
class CSE extends Mark{
    int algoDesign;
    CSE(int markICP, int markDSA, int algoDesign) {
        this.markICP = markICP;
        this.markDSA = markDSA;
        this.algoDesign = algoDesign;
    }
    @Override
    void getPercentage() {
        percentage = (markDSA+markICP+algoDesign) / 3.0;
        System.out.println("Percentage of Branch CSE: "+percentage);
    }
}
class NonCSE extends Mark{
    int engMechanics;
    NonCSE(int markICP, int markDSA, int engMechanics){
        this.markICP = markICP;
        this.markDSA = markDSA;
        this.engMechanics = engMechanics;
    }
    @Override
    void getPercentage() {
        percentage = (markDSA+markICP+engMechanics) / 3.0;
        System.out.println("Percentage of Branch Non CSE: "+percentage);
    }
}

public class Q6 {
    public static void main(String[] args) {
        CSE cs = new CSE(80,78,50);
        cs.getPercentage();
        NonCSE ncs = new NonCSE(56,78,84);
        ncs.getPercentage();
    }
}
