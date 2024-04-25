package Les1.Example5;

public class MainApp {
    public static void main(String[] args) {
        TestInstanceof ooject01 = new TestInstanceof();
        //
        //

        System.out.println("Is Object01 an instance of Testinstanceof?:"+(ooject01 instanceof TestInstanceof));
        System.out.println("Is Object01 an instance of DifferentTestClass?:"+(ooject01 instanceof DifferentTestClass));

        TestInstanceof test = null;

        System.out.println("Is test an instanceof:"+(test instanceof TestInstanceof));
    }


}
