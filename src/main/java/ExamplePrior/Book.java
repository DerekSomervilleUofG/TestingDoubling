package ExamplePrior;

public class Book {

    private String author;
    private String title;
    private int releaseYear;
    private int numberOfPages = 250;
    final String authorPrefix = "Author:";
    final String titlePrefix = "Title:";
    final String releaseYearPrefix = "Release Year:";
    final String numberOfPagesPrefix = "Number of Pages:";


    Book(String author, String title, int releaseYear, int numberOfPages){
        this.author = author;
        this.title = title;
        this.releaseYear = releaseYear;
        this.numberOfPages = numberOfPages;
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

    public int getNumberOfPages(){
        return numberOfPages;
    }

    protected String bookInformation(){
        String info = authorPrefix + " " + this.author;
        info += " " + titlePrefix + " " + this.title;
        info += " " + releaseYearPrefix + " " + this.releaseYear;
        info += " " + numberOfPagesPrefix + " " + this.numberOfPages;
        return info;
    }

    public void display(){
        System.out.println(bookInformation());
    }
}
