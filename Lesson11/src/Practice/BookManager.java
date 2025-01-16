package Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookManager {
    private List<Book> bookList;

    public BookManager() {
        bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void displayBooks() {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    public void sortBooksByPriceDescending() {
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return Float.compare(b2.getPrice(), b1.getPrice());
            }
        });
    }

    public static void main(String[] args) {
        BookManager manager = new BookManager();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Nhập số lượng sách: ");
            int n = Integer.parseInt(reader.readLine());

            for (int i = 0; i < n; i++) {
                System.out.println("Nhập thông tin sách thứ " + (i + 1) + ":");

                System.out.print("ISBN: ");
                String isbn = reader.readLine();

                System.out.print("Tên sách: ");
                String bookName = reader.readLine();

                System.out.print("Tác giả: ");
                String author = reader.readLine();

                System.out.print("Nhà xuất bản: ");
                String publisher = reader.readLine();

                System.out.print("Giá: ");
                float price = Float.parseFloat(reader.readLine());

                Book book = new Book(isbn, bookName, author, publisher, price);
                manager.addBook(book);
            }

            System.out.println("Danh sách sách vừa nhập:");
            manager.displayBooks();

            manager.sortBooksByPriceDescending();
            System.out.println("Danh sách sách sau khi sắp xếp theo giá giảm dần:");
            manager.displayBooks();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

