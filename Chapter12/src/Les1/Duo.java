package Les1;

public class Duo<E> {
    private E s1;
    private E s2;

    public Duo(E s1, E s2){
        this.s1=s1;
        this.s2=s2;
    }
    public E getS1(){
        return s1;
    }
    public void setS1(E s1){
        this.s1=s1;
    }
    public E getS2(){
    return s2;
    }
    public void setS2(E s2){
        this.s2=s2;
    }
    public void swap(){
        E temp=s1;
        s1=s2;
        s2=temp;
    }
}
