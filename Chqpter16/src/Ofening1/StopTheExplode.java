package Ofening1;

import java.util.Random;

public class StopTheExplode {
    public static void main(String[] args) {
        Random random = new Random();

        // Создаем объект TimeBomb с временем установки в 10 секунд
        // Maak een TimeBomb-object met een insteltijd van 10 seconden
        TimeBomb timeBomb = new TimeBomb(10);

        // Активируем бомбу.
        // Activeer de bom.
        timeBomb.activate();
        try {
            // Приостанавливаем выполнение программы на случайное время до 30 секунд
            // Pauzeer de uitvoering van het programma gedurende een willekeurige tijdsduur, maximaal 30 seconden
            Thread.sleep(random.nextInt(30000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Обезвреживаем бомбу
        // Maak de bom onschadelijk
        timeBomb.disarm();
    }
}
// Класс TimeBomb представляет собой таймер обратного отсчета для бомбы
// De klasse TimeBomb vertegenwoordigt een afteltimer voor een bom
class TimeBomb{
    private int seconds;

    // Конструктор класса, устанавливающий время таймера
    // Klasseconstructor die de timertijd instelt
    public TimeBomb(int seconds){
        this.seconds = seconds;
    }
    // Метод активации бомбы, выводящий сообщение о времени до взрыва
    // Methode voor het activeren van een bom, waarbij een bericht wordt weergegeven over de tijd tot de explosie

    public void activate(){
        System.out.println("De bom is geactiveerd! Je hebt " + seconds + " seconden om hem onschadelijk te maken");
        System.out.println("Бомба активирована! У вас есть " + seconds + " секунды, чтобы обезвредить её");
    }

    // Метод обезвреживания бомбы, сообщающий о результате обезвреживания или взрыве
    // Een methode voor het onschadelijk maken van bommen die het resultaat van het onschadelijk maken of een explosie rapporteert
    public void disarm() {
        if (seconds <= 0) {
            System.out.println("Boem! De bom ging af(Бум! Бомба взорвалась.)");
        } else {
            System.out.println("Bom onschadelijk gemaakt (Бомба обезврежена).");
        }
    }
}

