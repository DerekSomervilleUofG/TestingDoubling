package ExamplePrior;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LoadDelimitedFileTest {

    LoadDelimitedFile loadDelimitedFile = new LoadDelimitedFile();

    @Test
    void setDelimitor() {
    }

    @Test
    void getDataHeader() {
        List<String[]> bookData = loadDelimitedFile.getData("Books.csv");
        assertEquals("Author",bookData.get(0)[0]);
    }

    @Test
    void getDataFirstAuthor() {
        List<String[]> bookData = loadDelimitedFile.getData("Books.csv");
        assertEquals("Barrack Obama",bookData.get(1)[0]);
    }

    @Test
    void getDataFirstTitle() {
        List<String[]> bookData = loadDelimitedFile.getData("Books.csv");
        assertEquals("A Promised Land",bookData.get(1)[1]);
    }

    @Test
    void getDataFirstBook() {
        List<String[]> bookData = loadDelimitedFile.getData("Books.csv");
        String[] expectedBook = {"Barrack Obama","A Promised Land","2020"};
        assertArrayEquals(expectedBook,bookData.get(1));
    }

}