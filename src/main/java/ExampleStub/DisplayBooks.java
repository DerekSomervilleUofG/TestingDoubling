package ExampleStub;

import java.util.List;

public class DisplayBooks {
    private String fileName = "Books.csv";
    private LoadDelimitedFile loadFile = new LoadDelimitedFile();
    private int author = 0;
    private int title = 1;
    private int release = 2;

    protected String bookInfo(String[] header, String[] book){
        String bookDetails = header[author] + ": " + book[author];
        bookDetails += " " + header[title] + ": " + book[title];
        bookDetails += " " + header[release] + ": " + book[release];
        return bookDetails;
    }

    private void displayBook(String[] header, String[] book){
        System.out.println(bookInfo(header,book));
    }

    private void displayBooks(){
        List<String[]> books = loadFile.getData(fileName);
        String[] header = books.remove(0);
        for (String[] book : books) {
            displayBook(header,book);
        }
    }

    public static void main(String[] args){
        DisplayBooks displayBooks = new DisplayBooks();
        displayBooks.displayBooks();
    }
}
