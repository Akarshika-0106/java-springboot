package codingpractice.JavaCoreConcepts.Collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Book{
    private String name;
    private int pages;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}

public class ComparatorChainingExample {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book("System Design", 200),
                new Book("Queen", 200),
                new Book("Kite Runner", 450),
                new Book("Morashaki coffee shop", 150)
        );

        bookList.sort(Comparator.comparingInt(Book::getPages)
                .thenComparing(Comparator.comparing(Book::getName)));

        bookList.forEach(System.out::println);




    }
}
