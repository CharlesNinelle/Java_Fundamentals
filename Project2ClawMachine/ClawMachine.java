package Project2ClawMachine;
import java.util.Scanner;
public class ClawMachine extends Casino {

    private int numberOfTries = 0; // Tracker of tries(Счетчик попыток)

    private int currentPayout = 5000;

    public ClawMachine(int playerBalance){

        super(playerBalance, 1);

    }

    private boolean readyToWin(){

        return numberOfTries>=5&&(numberOfTries%5==0);

    }

//Checking if machine is ready to a big win

    private boolean readyToWinBigTime(){

        return numberOfTries>=10&&(numberOfTries%10==0);

    }


    public void playAGame(int moneyPaid) {
        if (moneyPaid==3){
            System.out.println("Congratulations! You won super big prize!");
            currentPayout++;
            playerBalance--;
            System.out.println("Player balance: " + playerBalance + " €");

            System.out.println("Current payout: " + currentPayout + " €");
        }

        else if (moneyPaid >= 1) {

            for (int i = 0; i < moneyPaid; i++) {

                if (numberOfTries < 15) {

                    System.out.println("Game start...");

                    numberOfTries++;

                    playerBalance -= 1;

                    currentPayout += 1;

                    if (readyToWin()) {

                        System.out.println("Congratulations! You won the prize!");

                    } else {

                        System.out.println("Sorry you dont win :(");

                    }

                    if (readyToWinBigTime()) {

                        System.out.println("Congratulations! You won the big prize!");

                    }

                    System.out.println("Player balance: " + playerBalance + " €");

                    System.out.println("Current payout: " + currentPayout + " €");

                } else {

                    System.out.println("Maximum number of attempts reached (15).");// Maximaal aantal pogingen bereikt (Достигнуто максимальное количество попыток)

                    break;

                }

            }

        } else {

            System.out.println("Please insert at least 1 € to play the game or your balance is insufficient.");

        }

    }

    @Override
    public void launch(Scanner scanner) {

        System.out.println("How much would you spent");
        int money = scanner.nextInt();
        playAGame(money);

    }

}


