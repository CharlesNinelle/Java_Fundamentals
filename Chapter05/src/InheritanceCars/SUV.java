package InheritanceCars;

public class SUV extends Car {
    private boolean bullbar;
    private boolean is4x4ON ;

    public SUV(String color, int speed, int hp, boolean bullbar, boolean isAWDOn) {
        super(color, speed, hp);
        this.bullbar = bullbar;
        this.is4x4ON  = isAWDOn;
    }

    public boolean getBullbar() {
        return bullbar;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;
    }

    public void allWheelDrive(boolean aWD) {
        is4x4ON  = aWD;
        if (is4x4ON  && speed > 30) {
            speed = 30;
        }
    }

    @Override
    public String toString() {
        return "SUV: color=" + getColor() + ", speed=" + getSpeed() + " km/h, hp=" + getHp() + ", bullbar=" + bullbar + ", 4x4=" + is4x4ON ;
    }
}
