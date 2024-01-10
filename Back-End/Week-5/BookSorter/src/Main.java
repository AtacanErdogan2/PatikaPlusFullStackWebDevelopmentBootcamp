import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();

        books.add(new Book("A Tale of Two Cities", 448, "Charles Dickens", 1859));
        books.add(new Book("The Little Prince", 96, "Antoine de Saint-Exupéry", 1943));
        books.add(new Book("Harry Potter and the Philosopher's Stone", 223, "J. K. Rowling", 1997));
        books.add(new Book("And Then There Were None", 272, "Agatha Christie", 1939));
        books.add(new Book("The Hobbit", 304, "J. R. R. Tolkien", 1937));

        System.out.println("\n=============Sorting by book title==================");

        for (Book b : books) {
            System.out.println(b.getName());
        }


        Set<Book> booksPageSort = new TreeSet<>(new Comparator<Book>() {

            // for sorting by number of pages
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getPageNumber() - b2.getPageNumber();
            }

        });

        booksPageSort.addAll(books);

        System.out.println("\n=============Sorting by number of pages=============");

        for (Book p : booksPageSort) {
            System.out.println(p.getName());
        }

    }
}
