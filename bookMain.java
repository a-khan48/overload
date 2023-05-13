import java.util.Scanner;
import java.util.ArrayList;
public class bookMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("1984", 300, 1948));
        books.add(new Book("holes", 125));
        books.add(new Book("Tom Clancy's Ghost Recon"));

        System.out.println("Enter nothing to break the loop.");

        while (true) {
            System.out.println("Book Title: ");
            String bookTitle = scanner.nextLine();

            if (bookTitle.equals(""))
                break;
            System.out.println("Enter page amount: ");
            int pageCount = Integer.parseInt((scanner.nextLine()));
            System.out.println("Enter the publishing date: ");
            int publishDate = Integer.parseInt(scanner.nextLine());

            books.add(new Book(bookTitle,pageCount,publishDate));
        }
        System.out.println("What information would you like printed? everything OR title");
        String printBook = scanner.nextLine();

        for (Book book: books) {
            System.out.println(book.print(printBook));
    }
}}
