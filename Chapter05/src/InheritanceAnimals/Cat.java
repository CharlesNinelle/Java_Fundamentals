package InheritanceAnimals;

public class Cat extends Animals {
    public Cat(String name, int age) {
        super(name, age);
    }

    // Переопределение метода makeSound для кошки
    // Override the makeSound method for a cat
    public void makeSound() {
        System.out.println("The cat meows");
    }
}
