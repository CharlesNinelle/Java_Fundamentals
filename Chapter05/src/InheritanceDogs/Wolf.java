package InheritanceDogs;

public class Wolf {
    private String name;
    private  int  lifespan;

    public Wolf (String name, int lifespan){
        this.name = name;
        this.lifespan = lifespan;
    }
    // Method for making a Wolf sound
    public void makeNoise() {
        System.out.println("wolf makes noise as default : Auuuuuuwwww ");
    }

    public String getName(String name) {return name;}
    public  void  setName(String name) {this.name=name;}
    public  int getLifespan(int lifespan) {return lifespan;}
    public  void  setLifespan(int lifespan){this.lifespan= lifespan;}
}
