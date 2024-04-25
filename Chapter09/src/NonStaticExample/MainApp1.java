package NonStaticExample;

public class MainApp1 {
    public static void main(String[] args) {
        OuterClass2 myOuter = new OuterClass2();
        OuterClass2.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y+ myOuter.x);
    }
}
