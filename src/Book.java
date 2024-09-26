public class Book {
    private String title;
    private Author author;
    private int dateOfPublication;


    public Book(String title, Author author, int dateOfPublication) {
        this.title = title;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
    }


    public String getTitle() {
        return this.title;
    }


    public Author getAuthor() {
        return this.author;
    }


    public int getDateOfPublication() {
        return this.dateOfPublication;
    }


    public void setDateOfPublication(int dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }
}
