package Oefening2Humans;

public class MainAppHumans {
    public static void main(String[] args) {
        // Создаем объекты разных классов животных
        // Create objects of different classes of animals
        Schooler theSchooler = new Schooler("Leonid", 7,"kid");
        Student theStudent = new Student("Igor", 19,"teenager");
        Professor theProfessor = new Professor("Andrey Petrovich", 77,"adult");

        // Вызываем метод HumansKnowledge() для каждого человека
        // Call the HumansKnowledge() method for each human
        theSchooler.knowledgeLevel();  // Prints "Schooler has low knwolege Level"
        theSchooler.powerLevel(); // Prints "and has low knwolege Level"

        theStudent.knowledgeLevel();  // Prints "Student has medium knwolege Level"
        theStudent.powerLevel(); // Prints " and has medium knwolege Level"

        theProfessor.knowledgeLevel(); // Prints "Professor has very high knwolege Level"
        theProfessor.powerLevel(); // Prints "but has very low live power level"

        // Получаем информацию о имени и возрасте каждого животного
        // Get information about the name and age of each animal
        System.out.println("Schooler name: " + theSchooler.getName() + ", Age: " + theSchooler.getAge()+", Status: "+theSchooler.getStatus());
        System.out.println("Student name: " + theStudent.getName() + ", Age: " + theStudent.getAge()+", Status: "+theStudent.getStatus());
        System.out.println("Name of the Professor: " + theProfessor.getName() + ", Age: " + theProfessor.getAge()+", Status: "+theProfessor.getStatus());
    }
}
