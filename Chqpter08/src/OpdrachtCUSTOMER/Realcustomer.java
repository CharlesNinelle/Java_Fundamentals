package OpdrachtCUSTOMER;

public class Realcustomer extends AbstractCustomer{
    public Realcustomer(String name){
        this.name=name;
    }
    @Override
    public boolean isNil(){
        return false;
    }
    @Override
    public String getName(){
        return name;
    }
}
