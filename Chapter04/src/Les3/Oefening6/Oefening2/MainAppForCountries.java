package Les3.Oefening6.Oefening2;

import java.util.Scanner;

public class MainAppForCountries {
    public static void main(String[] args) {
        System.out.println("Countries: ");
        for (int i = 0; i<Country.values().length;i++){
            System.out.println(i+"="+Country.values()[i]);
        }
        //calling a method with a switch option
        //MethodForCountries.displayAction(Country.Brazil);

       //Entering the index of the Country
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter index of the Country");
        int countryIndex = scanner.nextInt();

        //Country+Method(Action)
        Country selectedCountry = Country.values()[countryIndex];
        MethodForCountries.displayAction(selectedCountry);

    }


}
