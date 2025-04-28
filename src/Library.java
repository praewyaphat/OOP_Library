import java.util.ArrayList;

public class Library{
    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Add book: "+book.getTitle()+" Author: "+book.getAuthor());
        showAll();
    }

    public void removeBook(String title) {
        boolean found=false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                books.remove(i);
                System.out.println("Remove book: "+title);
                showAll();
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Book not found");
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.borrow();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public boolean searchBook(String name){
        for (Book book:books){
            if (book.getTitle().equals(name)){
                return true;
            }
        }
        return false;
    }

    public void showAll(){
        System.out.println("\n--------All Book----------");
        if(books.isEmpty()){
            System.out.println("No books in library");
        }else {
            for (Book book:books){
                System.out.println(book);
            }
        }
    }
}
