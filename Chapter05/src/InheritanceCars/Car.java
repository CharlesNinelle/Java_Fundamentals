package InheritanceCars;

public class Car {
    private String color;
    protected int speed;
    private int hp;
    private int distanceTraveled;// veld om afstand bij te houden // поле для отслеживания расстояния

    public Car(String color, int speed, int hp) {
        this.color = color;
        this.speed = speed;
        this.hp = hp;
        this.distanceTraveled = 0; // Initialiseer de afstand tot nul// Инициализируем расстояние нулем
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void accelerate(int amount) {
        int acceleration = amount + (hp / 100);
        speed += acceleration;
        distanceTraveled += speed; // Vergroot de afstand met de afgelegde afstand// Увеличиваем расстояние на пройденную дистанцию
    }

    public void slow(int amount) {
        int deceleration = amount + (hp / 100);
        speed -= deceleration;
        distanceTraveled += speed;// Verminder de afstand met de afgelegde afstand // Уmenshaem расстояние на пройденную дистанцию
    }

    public void park() {
        speed = 0;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    @Override
    public String toString() {
        return "Car: color=" + color + ", speed=" + speed + " km/h, hp=" + hp;
    }
}
