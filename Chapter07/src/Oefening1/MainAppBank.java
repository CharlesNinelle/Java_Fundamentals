package Oefening1;

public class MainAppBank {
    public static void main(String[] args) {
        Bank bankA = new BankA();
        System.out.println("Balance in Bank A is: "+bankA.getBalance());
        Bank bankB = new BankB();
        System.out.println("Balance in Bank B is: "+bankB.getBalance());
        Bank bankC = new BankC();
        System.out.println("Balance in Bank C is: "+bankC.getBalance());

        }
    }

