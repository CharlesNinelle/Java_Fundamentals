package OefeningVanGenerics;

public class MainApp {
    public static void main(String[] args) {
        Pair<String>stringPair = new Pair<>("Hallo", "Iedereen");
        System.out.println(stringPair.toString());

        Pair<Integer> intPair = new Pair<>(42, 99);
        System.out.println(intPair.toString());
    }
}
