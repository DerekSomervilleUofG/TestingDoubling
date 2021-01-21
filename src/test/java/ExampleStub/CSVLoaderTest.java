package ExampleStub;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LoadDelimitedFileTest {

    //LoadDelimitedFile loadDelimitedFile = new LoadDelimitedFile(new LoadDataStub());
    LoadDelimitedFile loadDelimitedFile = new LoadDelimitedFile();

    LoadDelimitedFileTest(){
        System.out.println("First constructor for LoadDelimitedFileTest");
        loadDelimitedFile.setLoadData(new LoadDataStub());
    }

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
        assertEquals("Derek Somerville",bookData.get(1)[0]);
    }

    @Test
    void getDataFirstTitle() {
        List<String[]> bookData = loadDelimitedFile.getData("Books.csv");
        assertEquals("MyBook",bookData.get(1)[1]);
    }

    @Test
    void getDataFirstBook() {
        List<String[]> bookData = loadDelimitedFile.getData("Books.csv");
        String[] expectedBook = {"Derek Somerville","MyBook","2019"};
        assertArrayEquals(expectedBook,bookData.get(1));
    }

}