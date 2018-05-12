package interfaceSample;

public class Adult implements FareType {

    @Override
    public int discount(int fare) {
        return fare;
    }

    @Override
    public String getFareTypeLabel() {
        return "おとな";
    }
}
