package Project1;


import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lasttName;
    private LocalDate dateOfBirth;

    public  Person(String firstName, String lasttName, LocalDate dateOfBirth){
        this.firstName=firstName;
        this.lasttName=lasttName;
        this.dateOfBirth=dateOfBirth;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLasttName(){
        return lasttName;
    }
    public LocalDate getDateOfBirth(){
        return  dateOfBirth;
    }
    @Override
    public String toString() {
        return firstName + " " + lasttName;
    }
}
