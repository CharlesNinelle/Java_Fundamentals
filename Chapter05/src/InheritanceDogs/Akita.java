package InheritanceDogs;

public class Akita extends HomelyDog {
    private char gender;

    public Akita(String name, int lifespan, char size, char fur, char gender){
        super(name, lifespan, size, fur);
        this.gender =gender;

        //Size depend of gender
        if (gender =='F'){
            this.setSize('M');
        }else if(gender=='M'){
            this.setSize('L');
        }
    }
    public void LayDown(){
        System.out.println("A is laying down");
    }
    public  void Sit(){
        super.Sit();// extends method from Dog
        System.out.println("Akita is very smart dog, and never obeys commands. It has a free soul. You can never make him sit.");
    }
    public  void Dance(){
        System.out.println("Akita is dancing");
    }
    public  void Sing (){
        System.out.println("Akita is singing");
    }
}
