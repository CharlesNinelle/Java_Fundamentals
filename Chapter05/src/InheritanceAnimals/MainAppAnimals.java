package InheritanceAnimals;

public class MainAppAnimals {
    public static void main(String[] args) {
        // Создаем объекты разных классов животных
        // Create objects of different classes of animals
        Cat myCat = new Cat("Myachik", 3);
        DogExample myDog = new DogExample("Tuzik", 2);
        Bird myBird = new Bird("Sova Larisa", 1);

        // Вызываем метод makeSound() для каждого животного
        // Call the makeSound() method for each animal
        myCat.makeSound();  // Prints "The cat is meowing"
        myDog.makeSound();  // Prints "The dog is barking"
        myBird.makeSound(); // Prints "The bird is singing"

        // Получаем информацию о имени и возрасте каждого животного
        // Get information about the name and age of each animal
        System.out.println("Cat name: " + myCat.getName() + ", Age: " + myCat.getAge());
        System.out.println("Dog's name: " + myDog.getName() + ", Age: " + myDog.getAge());
        System.out.println("Name of the bird: " + myBird.getName() + ", Age: " + myBird.getAge());
    }
}
