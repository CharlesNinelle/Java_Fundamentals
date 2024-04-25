package Les1;

public class MixedDuo <E,T>{
    private E object1;
    private T object2;

    public MixedDuo(E object1, T object2){
        this.object1=object1;
        this.object2=object2;
    }
    public E getObject1(){
        return object1;
    }
    public void setObject1(){
        this.object1=object1;
    }
    public T getObject2(){
        return object2;
    }
    public void setObject2(T object2){
        this.object2=object2;
    }
}
