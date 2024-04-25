package OefeningenvanArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ofening3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voer woorden in. Voer <end> in om te voltooien");
        List<String> gebruikersWoorden = Stream.generate(scanner::nextLine)
                .takeWhile(s -> !s.equals("end"))
                .collect(Collectors.toList());

        System.out.println("Woorden in de lijsr: ");
        gebruikersWoorden.forEach(System.out::println);
    }
}
