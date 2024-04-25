package Les3.Bank;

public class MainApp {
    public static void main(String[] args) {
        Bank bankrekening = new Bank();

        //Voorbeld van een salaris van een werknemer
        //Пример зарплаты сотрудника
        int jouwSalaris = 6000;

        //Voeg het salaris aan de bankrekening toe aan het begin van maand
        //Добавляем зарплату на банковский счет в начале месяца
        bankrekening.addAmountPerMonth(jouwSalaris);

        //Voorbeld van eebn bedrag voor rekening
        //Пример суммы на счете
        int bedragRekeningen = 1500;

        //Betaal de rekeningen
        //Оплатить счета
        bankrekening.payBills(bedragRekeningen);

        //Toon de status van de bankrekening op het scherm
        //Показать статус банковского счета на экране
        System.out.println("Bankrekening Status(Статус банковского счета): ");
        System.out.println("Total Geld(Всего денег): " + bankrekening.getMoneyOnBankAccount());
        System.out.println("Genoeg Geld aanwezig(Достаточно денег)? " + bankrekening.isEnoughOnBankAccount());
    }
}
