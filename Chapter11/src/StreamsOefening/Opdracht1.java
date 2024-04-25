package StreamsOefening;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

    public class Opdracht1 {

        public List<String> toUpperCase(List<String> strings) {
            return strings.stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
        }

        public List<String> filterA(List<String> strings) {
            return strings.stream()
                    .filter(s -> s.startsWith("a"))
                    .collect(Collectors.toList());
        }

        public List<String> filterB(List<String> strings) {
            return strings.stream()
                    .filter(s -> s.startsWith("a") && s.length() > 3)
                    .collect(Collectors.toList());
        }

        public List<String> filterC(List<String> strings) {
            return strings.stream()
                    .filter(s -> s.startsWith("a") && s.length() > 3)
                    .sorted((a, b) -> b.compareTo(a))
                    .collect(Collectors.toList());
        }


        public String filterD(List<String> strings) {
            return strings.stream()
                    .filter(s -> s.startsWith("a") && s.length() > 3)
                    .map(String::toUpperCase)
                    .sorted((a, b) -> b.compareTo(a))
                    .collect(Collectors.joining(","));
        }

        public String filterE(List<String> strings) {
            return strings.stream()
                    .filter(s -> s.startsWith("a") && s.length() > 3)
                    .map(s -> s.length() > 10 ? s.substring(0, 10).toUpperCase() : s.toUpperCase())
                    .sorted((a, b) -> b.compareTo(a))
                    .collect(Collectors.joining(","));
        }

        public String filterF(List<String> strings) {
            return strings.stream()
                    .filter(s -> s.startsWith("a") && s.length() > 3)
                    .map(s -> s.length() > 10 ? s.substring(0, 10).toUpperCase() : s.toUpperCase())
                    .sorted((a, b) -> b.compareTo(a))
                    .collect(Collectors.joining(","));
        }

        public String filterG(List<String> strings) {
            List<String> filteredList = strings.stream()
                    .filter(s -> s.startsWith("a") && s.length() > 3)
                    .map(s -> {
                        String modifiedString = s.toUpperCase();
                        modifiedString = "pri" + (s.length() > 10 ? s.substring(0, 10) : s) + "ble";
                        return modifiedString;
                    })
                    .sorted((a, b) -> b.compareTo(a))
                    .collect(Collectors.toList());

            return String.join(",", filteredList);
        }
        public String filterH(List<String> strings) {
            AtomicInteger uniqueNumber = new AtomicInteger(1);
            return strings.stream()
                    .filter(s -> s.startsWith("a") && s.length() > 3)
                    .map(s -> {
                        String modifiedString = s.toUpperCase();
                        if (s.length() > 10) {
                            modifiedString = "PRI" + s.substring(0, 10).toUpperCase() + "BLE" + " unique №" + uniqueNumber.getAndIncrement() + " Random №" + (int) (Math.random() * 100);
                        } else {
                            modifiedString = "PRI" + s.toUpperCase() + "BLE" + " unique №" + uniqueNumber.getAndIncrement() + " Random №" + (int) (Math.random() * 100);
                        }
                        return modifiedString;
                    })
                    .sorted((a, b) -> b.compareTo(a))
                    .collect(Collectors.joining(","));
        }

        public String filterL(List<String> strings) {
            AtomicInteger uniqueNumber = new AtomicInteger(1);
            return strings.stream()
                    .filter(s -> s.startsWith("a") && s.length() > 3)
                    .map(s -> {
                        String modifiedString = s.toUpperCase();
                        if (s.length() > 10) {
                            modifiedString = "PRI" + s.substring(0, 10).toUpperCase() + "BLE" + " unique №" + uniqueNumber.getAndIncrement() + " Random №" + (int) (Math.random() * 100);
                        } else {
                            modifiedString = "PRI" + s.toUpperCase() + "BLE" + " unique №" + uniqueNumber.getAndIncrement() + " Random №" + (int) (Math.random() * 100);
                        }
                        return modifiedString;
                    })
                    .sorted((a, b) -> b.compareTo(a))
                    .collect(Collectors.joining(","));
        }

    }
