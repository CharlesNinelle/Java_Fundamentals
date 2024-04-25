package InheritanceAnimals;

public class Animals {
    private String name;
    private int age;

    // Constructor of class Animal
    public Animals (String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method for making an animal sound
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // get and set for name and age
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
