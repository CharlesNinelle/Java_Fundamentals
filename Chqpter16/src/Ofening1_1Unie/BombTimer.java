package Ofening1_1Unie;

import java.time.LocalDateTime;
import java.util.Scanner;

public class BombTimer {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) throws InterruptedException {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Begin van het tellen: " + currentTime);

        Countdown countdown = new Countdown();
        countdown.start();

        System.out.println("Selecteer kleur: \n1. " + ANSI_RED + "Rood" + ANSI_RESET + "\n2. " + ANSI_BLUE + "Blauw" + ANSI_RESET);
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                countdown.stopBomb();
                break;
            case 2:
                countdown.explodeBomb();
                break;
            default:
                System.out.println("Verkeerde kleurkeuze(Неверный выбор цвета).");
        }

        // Добавим ожидание завершения потока перед завершением программы
        countdown.join();
    }
}

class Countdown extends Thread {
    private volatile boolean stop = false;
    private volatile boolean exploded = false;
    private volatile boolean countdownFinished = false;

    public void run() {
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println("Seconden resterend: " + i);
                Thread.sleep(1000);

                if (stop) {
                    System.out.println("Het aftellen is gestopt, de bom ontplofte niet");
                    return;
                }
            }

            countdownFinished = true; // Устанавливаем флаг, что отсчет завершен

            if (exploded) {
                System.out.println("De bom is ontploft!");
                return;
            }

            System.out.println("Einde van het aftellen.");

            if (!exploded) {
                System.out.println("De bom ontplofte niet.");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void stopBomb() {
        if (!countdownFinished) {
            stop = true;
        }
    }

    public void explodeBomb() {
        exploded = true;
        stop = true;
    }
}