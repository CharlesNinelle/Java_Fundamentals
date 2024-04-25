package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MainApp {
    public static void main(String[] args) {
        Queue<BurgerOrder> orders=new PriorityQueue<>(new BurgerOrderComparator());
        orders.offer(new BurgerOrder(" Cheesburger",3));
        orders.offer(new BurgerOrder(" Double burger",1));
        orders.offer(new BurgerOrder(" Veggi burger",5));
        System.out.println("In prossecing orders with PriorityQueque: ");
         while (!orders.isEmpty()){
             BurgerOrder order = orders.poll();
             System.out.println("Prepering: "+order.getNumber()+ order.getNaam()+"s");
         }
    }
}
