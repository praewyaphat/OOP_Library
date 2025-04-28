public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Harry Potter", "J.K. Rowling");
        Book book2 = new Book("Peter Pan", "J.M. Barrie");
        Book book3 = new Book("The Jungle Book", "Rudyard Kipling");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.showAll();

        library.removeBook("Peter Pan");
        library.showAll();
        System.out.println(library.searchBook("Peter Pan"));
        System.out.println(library.searchBook("Harry Potter"));

        library.borrowBook("Harry Potter");
        library.borrowBook("Harry Potter");
        library.showAll();

        library.returnBook("Harry Potter");
        library.returnBook("Harry Potter");
        library.showAll();
    }
}
