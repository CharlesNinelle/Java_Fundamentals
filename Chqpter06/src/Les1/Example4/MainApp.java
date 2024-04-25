package Les1.Example4;

public class MainApp {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.name="Intec Brussel";

        //Printing the parent class name
        System.out.println(parent.name);

        //parent class method is overridden method hence this will be executed
        parent.method();

        //Trying to Downcasting Implicitly, You will get compile time error.
        //Child child = new Parent();

        //Downcasting Explicitly
        Child child=(Child) parent;
        System.out.println(child.name);
        child.method();
    }
}
