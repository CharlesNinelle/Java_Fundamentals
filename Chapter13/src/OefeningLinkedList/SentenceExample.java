package OefeningLinkedList;

import java.util.Arrays;
import java.util.List;

public class SentenceExample {
    public static void main(String[] args) {
        // Maak een lijst met woorden
        List<String> sentence = Arrays.asList("Dit", "is", "een", "voorbeeld", "zin");

        // Roep de methoden op
        printSentence(sentence);
        printSentenceInReverseOrder(sentence);
        printNumberOfWords(sentence);
    }

    // Methode om de zin af te drukken
    private static void printSentence(List<String> sentence) {
        System.out.println("Sentence:");
        for (String word : sentence) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    // Methode om de zin in omgekeerde volgorde af te drukken
    private static void printSentenceInReverseOrder(List<String> sentence) {
        System.out.println("Sentence in reverse order:");
        for (int i = sentence.size() - 1; i >= 0; i--) {
            System.out.print(sentence.get(i) + " ");
        }
        System.out.println();
    }

    // Methode om het aantal woorden in de zin af te drukken
    private static void printNumberOfWords(List<String> sentence) {
        System.out.println("Number of words in the sentence: " + sentence.size());
    }
}
