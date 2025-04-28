public class Book implements Borrowable{
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public  String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

//    public boolean isBorrowed() {
//        return isBorrowed;
//    }

    @Override
    public void borrow(){
        if (!isBorrowed){
            System.out.println(title + " is borrowing completed successfully");
            isBorrowed = true;
        }else {
            System.out.println("Book is already borrowed.");
        }
    }

    @Override
    public void returnBook(){
        if (isBorrowed){
            System.out.println("Book return successful");
            isBorrowed = false;
        }else {
            System.out.println("Book not borrowed");
        }
    }

    @Override
    public String toString(){
        return "Title: "+ title +" | "+ "Author: " + author +" | "+" Status: "+(isBorrowed ? ("Borrowed"):("Available"));
    }
}
