package InheritanceAnimals;

    class DogExample extends Animals {
        public DogExample(String name, int age) {
            super(name, age);
        }

        // Переопределение метода makeSound для собаки
        // Override the makeSound method for a dog
        public void makeSound() {
            System.out.println("The dog barks");
        }
    }
