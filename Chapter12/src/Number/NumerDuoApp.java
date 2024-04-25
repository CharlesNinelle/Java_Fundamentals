package Number;

public class NumerDuoApp {
    public static void main(String[] args) {
        NumerDuo<Integer> nd1 = new NumerDuo<>(2,5);
        NumerDuo<Double> nd2 = new NumerDuo<>(2.5,5.7);
      //  NumerDuo<Number> nd3 = new NumerDuo<>(2,5);

        System.out.println(nd1.sum());
        System.out.println(nd2.sum());
       // System.out.println(nd3.sum());
    }
}
