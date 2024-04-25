package InheritanceDogs;

class Dog extends Wolf {
    private char size;

    public Dog(String name, int lifespan, char size) {
        super(name, lifespan);
        this.size = size;
    }
    public  char getSize(){
        return  size;
    }
    public  void setSize(char size){
        this.size=size;
    }

    public void makeNoise(){
        System.out.println("Dogs making noise in their manier");
    }
    public void Bark(){
        System.out.println("dog barks as : wow wow wow");
    }
    public void Sit(){
        System.out.println("if you give a command, the dog will sit");
    }
}
