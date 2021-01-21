package ExamplePrior;

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

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    public int getReleaseYear(){
        return releaseYear;
    }

    private String bookInformation(){
        String info = authorPrefix + " " + author;
        info += " " + titlePrefix + " " + title;
        info += " " + releaseYearPrefix + " " + releaseYear;
        return info;
    }

    public void display(){
        System.out.println(bookInformation());
    }
}
