package be.intecbrussel.Les5.Ofening7.Ofening7;

import java.time.LocalDate;
import java.time.Period;

public class Ofening3LeeftijdBerekening {
    public static void main(String[] args) {
        //Geboortedatum
        LocalDate bithdayDate = LocalDate.of(1984,10,27);
        //De huidige datum
        LocalDate currentDate = LocalDate.now();
        //Berekening van de leeftijd
        Period age =Period.between(bithdayDate,currentDate);

        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();

        System.out.println("Leeftijd:"+years+"oud, Aantal maanden:"+months+" maanden,  Aantal dagen:"+days+" dagen.");
    }
}
