package be.intrcbrussel.Les3.Examples;
import java.util.Random;//Importeren van de Random class
public class MethodRandom1 {
    public static void main(String[] args) {
        // creeren van een nieuw object
        Random random = new Random();

        //Het genereert een boolean value
        boolean randomBoolean = random.nextBoolean();
        System.out.println(randomBoolean);

        //Het genereert een double value
        double randomDouble = random.nextDouble();
        System.out.println(randomBoolean);

        //Het genereert een float value
        float randomFloat = random.nextFloat();
        System.out.println(randomFloat);

        //Het genereert een int value
        //int randomFloat = random.nextInt();
        //System.out.println(randomInt);

    }
}
