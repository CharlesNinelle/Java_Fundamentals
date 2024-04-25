package Les3.Oefening6.Oefening2;

public class MethodForCountries {

    public static void displayAction(Country country){

        String  countryName = country.toString();//Name of the country
        String action = "What to do:";//Action
        System.out.println("Your choice is "+countryName+" - "+action);
        switch (country){
            case USA:
                System.out.println("Visit New York");
                break;
            case India:
                System.out.println("Buy souvenirs");
                break;
            case Italy:
                System.out.println("Dont forget to buy cookies");
                break;
            case Japan:
                System.out.println("Visit a local market");
                break;
            case Brazil:
                System.out.println("Buy bright clothe");
                break;
            case Canada:
                System.out.println("Visit a mapl farm");
                break;
            case France:
                System.out.println("Visit the Louvre");
                break;
            case Germany:
                System.out.println("see a Friend");
                break;
            case Australia:
                System.out.println("Visit the opera");
                break;
            case Ukraine:
                System.out.println("Take a walk around Kyiv");
                break;
        }

    }
}
