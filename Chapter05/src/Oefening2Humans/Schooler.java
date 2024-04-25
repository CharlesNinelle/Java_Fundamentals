package Oefening2Humans;

class Schooler extends Humans {
    public Schooler(String name, int age, String status) {
        super(name, age, status);
    }

    // Метод переопределения knwolegeLevel для школьника
    // Method for overriding knwolegeLevel for a schooler
    public void knowledgeLevel() {
        System.out.println("Schooler has low knowledge Level");
    }
    //Метод оределения уровня энергии школьника
    //Method for determining energy level of schooler
    public void powerLevel() {
        System.out.println("and has high level of vital energy");
        System.out.println();
    }
}
