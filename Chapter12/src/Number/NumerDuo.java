package Number;

public class NumerDuo<E extends Number> {
    private E first;
    private E second;

    public NumerDuo(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public double sum() {
        return first.doubleValue() + second.doubleValue();
    }
}
