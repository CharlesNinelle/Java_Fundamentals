package Les1;

public class DuoApp {
    public static void main(String[] args) {
        Duo<String> duo = new Duo("a","b");
        System.out.println(duo.getS1()+duo.getS2());
    }
}
