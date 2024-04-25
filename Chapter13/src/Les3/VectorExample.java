package Les3;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        //Vector maken
        Vector<String> v=new Vector<>();
//Object toevoegen aan vector
        v.add("Inas");
                v.add("Adem");
                        v.add("Ilias");
                                v.add("Marwane");
//Lijst doorlopen via Iterator
                                        Iterator itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
