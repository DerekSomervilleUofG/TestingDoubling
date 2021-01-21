package ExampleStub;

public class Book {

    private String author;
    private String title;
    private int releaseYear;
    final String authorPrefix = "Author:";
    final String titlePrefix = "Title:";
    final String releaseYearPrefix = "Release Year:";


    Book(String author, String title, int releaseYear){
        this.author = author;
        this.title = title;
        this.releaseYear = releaseYear;
    }

    protected String bookInformation(){
        String info = authorPrefix + " " + author;
        info += " " + titlePrefix + " " + title;
        info += " " + releaseYearPrefix + " " + releaseYear;
        return info;
    }

    public void display(){
        System.out.println(bookInformation());
    }
}
