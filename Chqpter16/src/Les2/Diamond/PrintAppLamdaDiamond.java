package Les2.Diamond;

public class PrintAppLamdaDiamond {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> print(Threadcolors.ANSI_BLUE + "1", 100));
        Thread thread2 = new Thread(() -> print(Threadcolors.ANSI_GREEN + "2", 100));

        thread2.setDaemon(true);
        thread1.start();
        thread2.start();
        //Om aantal beschikbare cores op te vragen
        //Чтобы запросить количество доступных ядер
        System.out.println(Runtime.getRuntime().availableProcessors());
    }

    private static void print (String text, int count){
        for (int j = 0; j < count; j++){
            System.out.print(text);
            //De lus binnen de printmethode roept bij elke stap Thread yield() aan,
            //waardoor de processortijd beschikbaar wordt gemaakt voor doorgeven aan andere thread

            //Цикл внутри метода печати вызывает Thread yield() на каждом шаге,
            //предоставляем время процессора для передачи другому потоку

            Thread.yield();
        }
    }
}
