package Ofening1;

import java.time.LocalDateTime;

public class CountDown {
    public static void main(String[] args) {
        try {
            // Haal de huidige tijd op
            // Получаем текущее время
            LocalDateTime currentTime = LocalDateTime.now();
            System.out.println("Begin van het aftellen: " + currentTime);

            // Tel 10 seconden af
            // Отсчитываем 10 секунд
            for (int i = 10; i > 0; i--) {
                System.out.println("Seconden resterend: " + i);

                // Pauzeer de uitvoering van het programma gedurende 1 seconde
                // Приостанавливаем выполнение программы на 1 секунду
                Thread.sleep(1000);
            }

            // Получаем текущее время после отсчета
            // Haal de huidige tijd op na het aftellen
            LocalDateTime endTime = LocalDateTime.now();
            System.out.println("Einde van het aftellen: " + endTime);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
