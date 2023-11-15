package Project2VanStream;
abstract public class Person {
    protected String name;
    protected String lastname;

    public Person(){}

    public Person(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public String getLastName() {
        return lastname;
    }

    @Override
    public String toString(){
        return name + " " + lastname;
    }
}
