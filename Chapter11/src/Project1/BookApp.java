package Project1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class BookApp {
    public static void main(String[] args) {
        Book[] books = createBooks();

        BookUtils.print(Arrays.stream(books).max(Comparator.comparing(Book::getReleaseDate)).orElse(null));
        BookUtils.printYongestWriter(books);
        BookUtils.printSortedByTitle(books);
        BookUtils.countBooksPerAuthor(books);
        BookUtils.printBooksReleasedIn2016(books);

    }
    private static Book[] createBooks() {
        Person author1 = new Person("Rhiannon", "Frater", LocalDate.of(1969, 12, 16));
        Person author2 = new Person("Chloe", "Liese", LocalDate.of(1989, 10, 17));
        Person author3 = new Person("Ta-Nehisi", "Coates", LocalDate.of(1975, 9, 30));
        Person author4 = new Person("Morgan", "Housel", LocalDate.of(1990, 8, 15));
        Person author5 = new Person("Chiu", "Greanias", LocalDate.of(1954, 7, 27));

        Book[] books = new Book[]{
                new Book("The First Days", author1, LocalDate.of(2008, 8, 14), "Horror"),
                new Book("Better Hate than Never", author2, LocalDate.of(2023, 10, 10), "Romance"),
                new Book("Black Pantera", author3, LocalDate.of(2016, 6, 29), "Fantasy"),
                new Book("The Psychology of Money", author4, LocalDate.of(2020, 1, 01), "Psychology"),
                new Book("How This book Got Red", author5, LocalDate.of(2023, 10, 01), "Childrens"),
        };
        return books;
    }
}
