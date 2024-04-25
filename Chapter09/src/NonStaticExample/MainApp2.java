package NonStaticExample;

public class MainApp2 {
    public static void main(String[] args) {
        NonStatic nonStatic = new NonStatic();
        NonStatic.Inner inner = nonStatic.new Inner();
      nonStatic.run();
        inner.run();
    }
}
