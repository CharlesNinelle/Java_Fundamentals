package Project2VanStream;

import java.util.concurrent.atomic.AtomicInteger;

public class Student extends Person {
    private static final AtomicInteger idGenerator = new AtomicInteger(0);
    private final int id;


    public Student(String name, String lastName){
        super(name, lastName);
        this.id = idGenerator.incrementAndGet();
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString(){
        return super.toString()+"(ID: "+id+")";
    }
}
