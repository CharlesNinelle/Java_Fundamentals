package InheritanceDogs;

class HomelyDog extends Dog {
    private char fur;

    public HomelyDog(String name, int lifespan, char size, char fur) {
        super(name, lifespan, size);
        this.fur = fur;
    }

    public char getFur() {
        return fur;
    }

    public void setFur(char fur) {
        this.fur = fur;
    }


    public void Bark() {
        System.out.println("Homely dog also barks as : wow wow wow");
    }

    public void Sit() {
        System.out.println("Homely dog also can sit if you give a command");
    }
}