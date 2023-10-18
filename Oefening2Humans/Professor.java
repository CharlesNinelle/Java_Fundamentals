package Oefening2Humans;

class Professor extends Humans {
    public Professor(String name, int age, String status) {
        super(name, age, status);
    }

    // Метод переопределения knwolegeLevel для профессора
    // Method for overriding knwolegeLevel for a professor
    public void knowledgeLevel() {
        System.out.println("Professor has very high knowledge Level");

    }
    //Метод оределения уровня энергии профессора
    //Method for determining energy level of professor
    public void powerLevel() {
        System.out.println("but has very low level of vital energy");
        System.out.println();
    }
}
