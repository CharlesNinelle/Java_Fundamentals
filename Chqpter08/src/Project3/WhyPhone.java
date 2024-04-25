package Project3;

public class WhyPhone extends SmartPhone {
    private final String COLOR;

    public WhyPhone(double PRICE, String BRAND, String COLOR){
        super(PRICE,BRAND);
        this.COLOR=COLOR;
    }
    String getCOLOR() {
        return COLOR;
    }
}
