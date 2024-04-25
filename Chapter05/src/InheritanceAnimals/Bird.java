package InheritanceAnimals;

public class Bird extends Animals {
    public Bird(String name, int age) {
        super(name, age);
    }

    // Переопределение метода makeSound для птицы
    // Override the makeSound method for the bird
    public void makeSound() {
        System.out.println("The bird sings");
    }
}
