package Oefening2Humans;

class Student extends Humans {
    public Student(String name, int age, String status) {
        super(name, age, status);
    }

    // Метод переопределения knwolegeLevel для студента
    // Method for overriding knwolegeLevel for a student
    public void knowledgeLevel() {
        System.out.println("Student has medium knowledge Level");
    }
    //Метод оределения уровня энергии студента
    //Method for determining energy level of student
    public void powerLevel() {
        System.out.println("and has very high level of vital energy");
        System.out.println();
    }
}
