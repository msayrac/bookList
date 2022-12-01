import java.util.ArrayList;
import java.util.Scanner;

public class Book {

    private int id;

    private String bookName;
    private int pageNumber;
    private String authorName;
    private String publicationDate;

    ArrayList<Book> bookArrayList = new ArrayList<>();

    public Book(int id, String bookName, int pageNumber, String authorName, String publicationDate) {
        this.id = id;
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
        this.bookArrayList = bookArrayList;
    }

    public Book() {

    }

    public void addBook(){
        System.out.print("How many book do you want to add : ");

        Scanner inputNBook = new Scanner(System.in);

        int nBook = inputNBook.nextInt();

        while(bookArrayList.size()<nBook){

            for (int bookId=1; bookId<=nBook; bookId++){

                System.out.print("Please add a book information : ");
                Scanner input = new Scanner(System.in);

                /*System.out.println("id add : ");
                int id = input.nextInt();*/

                int id = setId(bookId);

                System.out.print("Book name  : ");
                String bookName = input.next();

                System.out.print("pageNUmber : ");
                int pageNumber = input.nextInt();

                System.out.print("Name Author : ");
                String authorName = input.next();

                System.out.print("Date add : ");
                String publicationDate = input.next();

                bookArrayList.add(new Book(id,bookName,pageNumber,authorName,publicationDate));
            }
        }



        System.out.println("Full Book List : ");
        for (Book b:bookArrayList ) {
            System.out.println(b.getId() + " : " + b.getBookName() +" : "+ b.getAuthorName() + " page number : " + b.getPageNumber());
        }
    }

    public void filteredBookList(){
        System.out.println("****************************");
        System.out.println("****************************");

        System.out.println("Filtered Book List : ");
        for (Book b:bookArrayList ) {

            if(b.getPageNumber()>100){
                System.out.println(b.getId() + " : " + b.getBookName() +" : "+ b.getAuthorName() + " page number : " + b.getPageNumber());

            }

        }
    }



    public int getId() {
        return id;
    }

    public int setId(int id) {
        this.id = id;
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public ArrayList<Book> getBookArrayList() {
        return bookArrayList;
    }

    public void setBookArrayList(ArrayList<Book> bookArrayList) {
        this.bookArrayList = bookArrayList;
    }



}
