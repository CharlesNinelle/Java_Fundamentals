package PriorityQueue;

import java.util.Comparator;

public class BurgerOrderComparator implements Comparator<BurgerOrder> {
    @Override
    public int compare(BurgerOrder order1, BurgerOrder order2) {
        return Integer.compare(order2.getNumber(), order1.getNumber());
    }
}
