package Oefening2Humans;

class Humans {

    private String name;
    private int age;
    private String status;

    // Constructor of class Humans
    public Humans(String name, int age, String status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    // People Knowledge Level Method
    public void HumansKnowledge() {
        System.out.println("People have knowledge");
    }

    // get and set for name and age and status
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

