package OpdrachtCUSTOMER;

public class CustomerFactory {
    private static final String[] names ={"Rob","Bob","Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (String customerName : names){
            if (customerName.equalsIgnoreCase(name)){
                return new Realcustomer(name);
            }
        }
        return new NullCustomer();
    }
}
