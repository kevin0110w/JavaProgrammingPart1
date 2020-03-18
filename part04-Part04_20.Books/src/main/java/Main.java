
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        List<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }
        System.out.print("What information will be printed? ");
        String command = scanner.nextLine();
        printBooks(command, books);
    }

    private static void printBooks(String command, List<Book> books) {
        if (command.equals("everything")) {
            for (Book b : books) {
                System.out.println(b);
            }
        } else if (command.equals("name")) {
            for (Book b : books) {
                System.out.println(b.getTitle());
            }
        }
    }
}

