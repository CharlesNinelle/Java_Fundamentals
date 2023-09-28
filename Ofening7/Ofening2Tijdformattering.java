package be.intecbrussel.Les5.Ofening7.Ofening7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ofening2Tijdformattering {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM y., HH:mm:ss");
        String formattedDate = dateFormat.format(currentDate);

        System.out.println("Geformatteerde datum en tijd: "+formattedDate);
    }
}
