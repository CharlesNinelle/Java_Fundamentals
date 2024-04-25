package ProjectMultithreading;

public class MainApp {
    public static void main(String[] args) {
        Person jerry = new Person("Jerry", 70, 5000);
        Person lilly = new Person("Lilly", 72, 5300);
        Person louis = new Person("Louis", 37, 6000);
        Person stephane = new Person("Stephane", 6, 8000);

        jerry.startLife();
        lilly.startLife();
        louis.startLife();
        stephane.startLife();
    }
}
