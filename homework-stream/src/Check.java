import java.util.ArrayList;
import java.util.List;

public class Check {
    public static void main(String[] args) {
        // Создание трех объектов Book
        Book book1 = new Book("Автор 1", "Книга 1", 29.99);
        Book book2 = new Book("Автор 2", "Книга 2", 19.99);
        Book book3 = new Book("Автор 3", "Книга 3", 24.99);
        Book book4 = new Book("Автор 2", "Книга 4", 124.99);

        book1.addReview("Отличная книга!");
        book1.addReview("Мне понравилось");
        book2.addReview("Рекомендую всем!");

        // Создание списка и добавление книг в него
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        System.out.println(TaskStream.task7(books));
    }
}
