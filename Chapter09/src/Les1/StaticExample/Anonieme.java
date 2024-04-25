package Les1.StaticExample;

public class Anonieme {
    public void run(){System.out.println("De run methode van een gewoe klasse");}

    public static void main(String[] args) {
        Anonieme a=new Anonieme(){
            public void run(){
                System.out.println("De run methode van anonieme klasse");
            }
            //public void print(){
            //System.out.println("print");
        };
        a.run();
    }
}
