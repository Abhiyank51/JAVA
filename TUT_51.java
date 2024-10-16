// Exercise 4 
/*
Online Library
You have to implement a library using java 
Methods -  addBook, issueBook, returnBook, showAvailableBooks
Properties : Array to store the available books
            Array to store the issued books
*/

class Library{
    String[] books;
    int no_of_books;
    // Constructor 
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book +" has been added");
    }

    void showAvailableBooks(){
        System.out.println("Available books are: ");
        for (String book : this.books) {
            if (book == null){
                continue;
            }
            else{
                System.out.println("* "+ book);
            }
        }
    }

    void issueBook(String book){
        for (int i = 0; i<this.books.length; i++) {
            if(this.books[i].equals((book))){
                System.out.println(book +" has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exists");
    }

    void returnBook(String book){
        addBook((book));
    }
}

public class TUT_51{
    public static void main(String[] args) {
        Library CentralLibrary = new Library();
        // ADD BOOKS IN LIBRARY
        CentralLibrary.addBook("Think and grow rich");
        CentralLibrary.addBook("Algorithm");
        CentralLibrary.addBook("Machine Learning");
        // SHOW AVAILABLE BOOKS IN LIBRARY
        CentralLibrary.showAvailableBooks();
        // ISSUE THE BOOK
        CentralLibrary.issueBook("Algorithm");
        // SHOW AVAILABLE BOOKS AFTER ISSUING 
        CentralLibrary.showAvailableBooks();
        // RETURN THE ISSUED BOOK
        CentralLibrary.returnBook("Algorithm");
        // NOW SHOW THW TOTAL BOOKS
        CentralLibrary.showAvailableBooks();
    }
}
