package Project3;

public class WhyPhoneApp {
    public static void main(String[] args) {
        //Instantie van SmartPhone maken
        SmartPhone phone = new SmartPhone(500.0, "SmartBrand");
        System.out.println("Price: "+phone.getPRICE()+", Brand: "+phone.getBRAND());
        //Methoden aanropen voor SmartPhone
        phone.shootAPhoto(5);
        //Andere methoden oproepen volgens behoefte
        phone.locate(51.5074, 0.1278);
        phone.navigate();
        phone.playChannel(93.7);
        phone.changeChannel(101.2);
        phone.connect("Wi-fi");
        phone.disconnect("Wi-Fi");
    }
}
