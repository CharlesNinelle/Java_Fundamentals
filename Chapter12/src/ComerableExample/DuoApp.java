package ComerableExample;

public class DuoApp {
    public static void main(String[] args) {
        ComparableDuo<Integer> d1 = new ComparableDuo<>(3,5);
        ComparableDuo<Double> d2 = new ComparableDuo<>(3.5,5.7);

        System.out.println(d1.getHighest());//5
        System.out.println(d2.getLowest());//3.5

        ComparableDuo<String> s1 = new ComparableDuo<>("Mert","Yigit");
        System.out.println(s1.getLowest());//Mert
    }
}
