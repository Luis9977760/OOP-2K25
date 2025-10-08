public class Library {
    public static void main(String[] args) {
        LibraryBook libraryBook1= new LibraryBook("A Journey to the Moon", "JK Rowling", "001");
        LibraryBook libraryBook2= new LibraryBook("OOP for Beginners", "Carl Enrique", "002" );
        libraryBook1.checkOut();
        libraryBook2.checkOut();
        libraryBook1.returnBook();
        libraryBook1.displayInfo();
        libraryBook2.displayInfo();
    }
}
class LibraryBook{
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    private static int totalBooksCreated;

    LibraryBook(String title, String author, String isbn){
        this.title= title;
        this.author= author;
        this.isbn= isbn;
        this.isAvailable= true;
        totalBooksCreated++;
    }

    public static int getTotalBooks(){
        return totalBooksCreated;
    }

    public void checkOut(){
        this.isAvailable= false;
    }

    public void returnBook(){
        this.isAvailable= true;
    }

    public void displayInfo(){
        System.out.println("Title: "+ title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Available Books: " + isAvailable);
    }

    public boolean getAvailable(){
        return this.isAvailable;
    }
}
