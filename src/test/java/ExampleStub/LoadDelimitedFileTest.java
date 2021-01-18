package ExampleStub;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LoadDelimitedFileTest {

    LoadDelimitedFile loadDelimitedFile = new LoadDelimitedFile();

    @Test
    void setDelimitor() {
    }

    @Test
    void getDataStubHeader() {
        loadDelimitedFile.setLoadData(new LoadDataStub());
        List<String[]> stubData = loadDelimitedFile.getData("Book.csv");
        assertEquals("Author",stubData.get(0)[0]);
    }

    @Test
    void getDataStubFirstAuthor() {
        loadDelimitedFile.setLoadData(new LoadDataStub());
        List<String[]> stubData = loadDelimitedFile.getData("Book.csv");
        assertEquals("Derek Somerville",stubData.get(1)[0]);
    }

    @Test
    void getDataStubFirstTitle() {
        loadDelimitedFile.setLoadData(new LoadDataStub());
        List<String[]> stubData = loadDelimitedFile.getData("Book.csv");
        assertEquals("MyBook",stubData.get(1)[1]);
    }

    @Test
    void getDataStubFirstBook() {
        loadDelimitedFile.setLoadData(new LoadDataStub());
        List<String[]> stubData = loadDelimitedFile.getData("Book.csv");
        String[] expectedBook = {"Derek Somerville","MyBook","2019"};
        assertArrayEquals(expectedBook,stubData.get(1));
    }

}