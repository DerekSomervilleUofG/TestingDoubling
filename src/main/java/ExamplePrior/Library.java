package ExamplePrior;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String fileName = "Books.csv";
    private CSVLoader loadFile = new CSVLoader();
    private List<Book> listOfBooks = new ArrayList<Book>();

    public void loadBooks(){
        List<String[]> books = loadFile.getData(fileName);
        String[] header = books.remove(0);
        Book book;
        for (String[] bookDetails : books) {
            book = new Book(bookDetails[0],bookDetails[1], Integer.parseInt(bookDetails[2]));
            listOfBooks.add(book);
            book.display();
        }
    }

    public static void main(String[] args){
        Library library = new Library();
        library.loadBooks();
    }
}
