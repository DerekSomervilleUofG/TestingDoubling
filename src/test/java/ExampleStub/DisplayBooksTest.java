package ExampleStub;

import static org.junit.jupiter.api.Assertions.*;

class DisplayBooksTest {

    DisplayBooks displayBooks = new DisplayBooks();

    @org.junit.jupiter.api.Test
    void bookInfo() {
        String [] header = {"Author","Title","Release"};
        String[] book = {"Derek Somerville","MyBook","2020"};
        String formatedBook = displayBooks.bookInfo(header,book);
        assertEquals("Author: Derek Somerville Title: MyBook Release: 2020",formatedBook);
    }
}