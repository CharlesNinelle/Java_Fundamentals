package PriorityQueue;

public class BurgerOrder {
    private String naam;
    private int number;

    public BurgerOrder(String naam, int number) {
        this.naam = naam;
        this.number = number;
    }

    public String getNaam() {
        return naam;
    }

    public int getNumber() {
        return number;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
