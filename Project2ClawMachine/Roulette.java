package Project2ClawMachine;
import java.util.Random;
import java.util.Scanner;
public class Roulette extends Casino {
    //Attributes
    private int amountsOfTimesHouseLost = 1;
    private int winningNumber;
    private int payout;
    private Random random = new Random();

    public Roulette(int playerBalance){
        super(playerBalance, 200);
    }

    //methode : hier ga je kijken of dat het huis al meer dan 3 keer heeft verlonen Of dat de payout kleiner is dan 500
    private void shouldFailSafeBeUsed(int numberChosen) {
        if (amountsOfTimesHouseLost > 3 || payout < 500) {
            //als 1 van de twee conditie waar zijn , dan nieuw random treken tussen 0 en 20
            do {
                winningNumber = random.nextInt(21);//genereren een willekeurige nummber tussen 0 en 20
            } while (winningNumber == numberChosen);//totdat de winningsNumber niet hetzelfde is als de numberChosen
        }else {
            winningNumber = random.nextInt(21);//zoniet moet je maar 1 keer die random
        }
    }

    //in deze methode moet nakijken of de winningsNumber overeenkomst met de numberChosen, Als dit het geval is, krijg 500 Euro
    public int rolleTheRoulette(int moneyPutIn, int numberChosen) {
        payout += moneyPutIn;
        playerBalance -= moneyPutIn;
        shouldFailSafeBeUsed(numberChosen);
        System.out.println("Winning numer is: "+winningNumber);
        if (winningNumber == numberChosen) {
            payout -= 500; //als in dit geval casinoBalance minder dan payout
            playerBalance += 500;
            return 500;  //dan krijgt de player 500 Euro
        } else {
            return 0;//dan geen geld nodig
        }
    }

    @Override
    public void launch(Scanner scanner) {
        int number = -1;

        System.out.println("Welcome to Roulette, game cost 200€: guess 1 number 0-20: ");
        number = scanner.nextInt();

        System.out.println("You won: "+rolleTheRoulette(200,number)+ "€ current payout is: "+payout+" and player balance is: "+playerBalance );
    }
}
