package Project3;

public class SmartPhone implements ICamera,IGPS,IRadio,ISimCard,IWife {

    private final  double PRICE;
    private final  String BRAND;
    private int numberOfPhotos;
    public SmartPhone(double PRICE, String BRAND){
        this.PRICE=PRICE;
        this.BRAND=BRAND;
    }
    public double getPRICE() {
        return PRICE;
    }

    public String getBRAND() {
        return BRAND;
    }



    @Override
    public void shootAPhoto(double amountOfPhotos){
    }
    @Override
    public String[] viewPhotos(){
        return null;//Dummy return
    }
    @Override
    public String locate(double latitude, double longitude){
        return null;//Dummy return
    }
    @Override
    public void navigate(){
    }
    @Override
    public void playChannel(double fm){
    }
    @Override
    public void changeChannel(double fm){
    }
    @Override
    public void connect(String internetConnection){
    }
    @Override
    public void disconnect(String intrnetConnection){
    }



}

