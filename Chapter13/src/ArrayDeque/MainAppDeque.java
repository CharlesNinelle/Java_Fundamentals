package ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;


public class MainAppDeque {
    public static void main(String[] args) {
        Deque<Person> persons =new ArrayDeque<>();

        //Mensen aan de wachtrij toevoegen
        persons.offerFirst(new Person("Matt",Person.Gender.MALE));
        persons.offerFirst(new Person("John",Person.Gender.MALE));
        persons.offerFirst(new Person("Jerry",Person.Gender.MALE));

        persons.offerLast(new Person("Katy",Person.Gender.FEMALE));
        persons.offerLast(new Person("Suzan",Person.Gender.FEMALE));
        persons.offerLast(new Person("Mary",Person.Gender.FEMALE));

        Person person = persons.pollFirst();
        //Paren Vormen
        while (person !=null){
            //Een paar afdrukken
            System.out.println("Couple are: "+person+ " and " +persons.pollLast());
            person=persons.pollFirst();
            }
        }
    }
