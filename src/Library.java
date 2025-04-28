import java.util.ArrayList;

public class Library{
    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Add book: "+book);
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


    public boolean searchBook(String name){
        for (Book book:books){
            if (book.getTitle().equals(name)){
                return true;
            }
        }
        return false;
    }

    public void showAll(){
        System.out.println("--------All Book----------");
        if(books.isEmpty()){
            System.out.println("No books in library");
        }else {
            for (Book book:books){
                System.out.println("Title: "+book.getTitle()+" Author: "+ book.getAuthor()+" Status: "+book.isBorrowed());
            }
        }
    }
}
