package StreamsOefening;

import java.util.Arrays;
import java.util.Comparator;

public class MethodenForPeople {


    public void FemaleGender(Employee[] employees){
        System.out.println("Female is: ");
        Arrays.stream(employees)
                .filter(e -> e.getGender().equals("Female"))
                .map(e -> e.getFirstName()+""+e.getLastName())
                .forEach(e -> System.out.println(e));
}
    public void NewJoiner(Employee[] employees){
        System.out.println("New Joiner is: ");
        Arrays.stream(employees)
                .filter(e -> e.getNewJoiner().equals("True"))
                .map(e -> e.getFirstName()+""+e.getLastName())
                .forEach(e -> System.out.println(e));
    }

    public void Rating(Employee[] employees){
        System.out.println("Rating from 5 to 0: ");
        Arrays.stream(employees)
                .sorted(Comparator.comparing(Employee::getRating).reversed())
                .map(e -> e.getRating()+ " rating "+"has "+e.getFirstName()+" "+e.getLastName() )
                .forEach(e -> System.out.println(e));
    }

    }
