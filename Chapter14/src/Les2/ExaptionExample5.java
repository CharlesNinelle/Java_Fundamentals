package Les2;

import java.util.Scanner;

public class ExaptionExample5 {
    public static void main(String[] args) {
        String sLeeftijd;
        int iLeeftijd;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Geef je leeftijd in");
        sLeeftijd = scanner.nextLine();

        //controle of Leeftijd een geheel getal bevat of niet
        try{
            iLeeftijd = Integer.parseInt(sLeeftijd);//kan ook vis Double of Float.parseFloat
            System.out.println("Jouw leeftijd: "+iLeeftijd);
        }
        catch (NumberFormatException nfe){
            //de numerieke waarde(numerformat) klopt niet
            System.out.println("Err: leeftijd bevat geen numerieke waarde");
        }
    }
}
