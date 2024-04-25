package Les3.Bank;

public class Bank {
    private boolean enoughOnBankAccount = false;
    private int moneyOnBankAccount = 1000;
    public boolean isEnoughOnBankAccount(){return enoughOnBankAccount;}
    public void setEnoughOnBankAccount(boolean enoughOnBankAccount){this.enoughOnBankAccount=enoughOnBankAccount;}
    public int getMoneyOnBankAccount(){return moneyOnBankAccount;}
    public  void setMoneyOnBankAccount(int moneyOnBankAccount){this.moneyOnBankAccount=moneyOnBankAccount;}

    //deze methode wordt gesynchroniseerd en vervolgens stuurt het een notificatie naar eventuele wachtende threads
    //zodra het bedrag op de rekening hoger dan 3000 wordt.
    //этот метод будет синхронизирован, а затем отправит уведомление всем ожидающим потокам
    //как только сумма на счету превысит 3000.
    public synchronized void addAmountPerMonth(int yourPay){
        moneyOnBankAccount += yourPay;
        if(moneyOnBankAccount>3000){
            enoughOnBankAccount=true;
        }
        notify();
    }
    public synchronized void payBills(int amountBills){
        while (!enoughOnBankAccount){
            try{
                //wait() laat de thread wachten tot er voldoende geld is
                //wait() пусть тред подождет, пока денег не накопится
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        moneyOnBankAccount -= amountBills;
        //notyfy() waarschuwt andere threads dat er genoeg geld is om de rekeningen te betalen
        //notyfy() активирует другие потоки, в которых генерируется информация о обратных вызовах
        notify();
    }
}
