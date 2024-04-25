package StreamsOefening;

public class People {
    public static void main(String[] args) {
        Employee[] employees = {
        new Employee("59-385-1088", "Zacharias", "Schwerin", "zchwerin@gmail.com", "Male", "True", 101146, 0),
        new Employee("73-274-6476", "Kyle", "Frudd", "kfrudd1@ovh.net", "Male", "FALSE", 29310, 2),
        new Employee("85-939-9584", "Axe", "Gumb", "agumb2@twitter.com", "Female", "FALSE", 62291, 4),
        new Employee("08-180-8292", "Robinet", "Batterham", "rbatterham3@last.fm", "Male", "FALSE", 142439, 4),
        new Employee("21-825-2623", "Ulick", "Burrel", "uburrel4@google.ru", "Male", "FALSE", 128764, 5),
        new Employee("66-708-5539", "Tailor", "Ridding", "Ridding", "Female", "FALSE", 152924, 4),
        new Employee("81-697-2363", "Joete", "Braybrooke", "jbraybrooke6@prnewswire.com", "Male", "True", 128907, 0),
        new Employee("63-019-1110", "Elroy", "Baverstock", "ebaverstock7@ehow.com", "Male", "True", 2510, 0),
    };
    MethodenForPeople myMethodsForPeople = new MethodenForPeople();
        System.out.println("******************************************");
        myMethodsForPeople.FemaleGender(employees);
        System.out.println("******************************************");
        myMethodsForPeople.NewJoiner(employees);
        System.out.println("******************************************");
        myMethodsForPeople.Rating(employees);


    }
}
