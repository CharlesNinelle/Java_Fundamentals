package Oefening2;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("****************");
        System.out.println();
        Dog dog = new Dog();
        dog.ordinaryMethod();
        {
            System.out.println("but dogs is barking");
        }
        System.out.println();
        System.out.println("***************");
        System.out.println();

        Cat cat = new Cat();
        cat.ordinaryMethod();
        {
            System.out.println("but cats is meowning");
        }
    }
}