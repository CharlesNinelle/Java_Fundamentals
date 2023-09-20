package be.intecbrussel.Les3.Ofeninf2.Ofeninf2;

public class Ofening4 {
    public static void main(String[] args) {
        float floatNum = 10.99F;
        short shortNum = 101;

//Voorbeelden van het gebruik van toewijzingsoperatoren
        floatNum += shortNum; // Werken: shortNum teruggebracht tot float en telt mee floatNum
        System.out.println("floatNum += shortNum: " + floatNum);

        shortNum += floatNum; // Werkt niet: floatNum wordt impliciet gereduceerd tot short, wat gegevensverlies kan veroorzaken
        System.out.println("shortNum += floatNum: " + shortNum);
    }
}
