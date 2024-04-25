package Project1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BookUtils {
    public static void print(Book book){
        if (book!=null){
            System.out.println("The newest book is: "+book.getTitle());
        }
    }

    public static void printYongestWriter(Book[]books) {
        Person youngestWriter = Arrays.stream(books)
                .min(Comparator.comparing(book -> book.getAuthor().getDateOfBirth()))
                .map(Book::getAuthor)
                .orElse(null);
        if (youngestWriter != null) {
            System.out.println("The youngest author is: " + youngestWriter.getFirstName() + " " + youngestWriter.getLasttName());
        }
    }

    public static void printSortedByTitle(Book[]books){
        System.out.println("Books in alphabetical order:");
        IntStream.range(0, books.length)
                .mapToObj(i -> "The Book №" + (i + 1) + ": " + books[i].getTitle())
                .forEach(System.out::println);
    }

    public static void countBooksPerAuthor(Book[]books){
        System.out.println("Number of books by authors:");
        Map<Person,Long> booksPerAuthor=Arrays.stream(books)
                .map(Book::getAuthor)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        booksPerAuthor.forEach((author,count)-> System.out.println(author+": "+count));
    }

    public static void printBooksReleasedIn2016(Book[]books){
        Arrays.stream(books)
                .filter(book -> book.getReleaseDate().getYear()==2016)
                .forEach(book -> System.out.println("The book was published in 2016: "+book.getTitle()));
    }
}
