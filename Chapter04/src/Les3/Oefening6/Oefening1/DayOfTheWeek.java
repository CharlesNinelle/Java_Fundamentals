package Les3.Oefening6.Oefening1;

public class DayOfTheWeek {
        public static void main(String[] args) {
            // Krijg toegang tot de enumwaarden en druk ze af met indexen
            //Access the enum values and print them with indexes
            for (DayOfTheWeek1 day : DayOfTheWeek1.values()) {
                System.out.println(day + " - Index: " + day.getIndex());
            }
        }
    }
