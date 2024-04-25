package Les1.Example5;

public class DifferentTestClass extends TestInstanceof{
    public static void main01(TestInstanceof test) {
        if (test instanceof  DifferentTestClass){
            DifferentTestClass dtc=(DifferentTestClass) test;
            System.out.println("Downcasting works!");
        }
    }
}
