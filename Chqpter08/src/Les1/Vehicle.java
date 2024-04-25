package Les1;

public interface Vehicle {
    //constant variables->bad practice
    public static final int doors=3;//public static is unnecessary!
    int wheels=4;

    //methods
    public abstract void speedUp();//public abstract is unnecessary!
    void braking();
    void shiftGearUp();
    void shiftGearDown();
    int getCurrentGear();
}
