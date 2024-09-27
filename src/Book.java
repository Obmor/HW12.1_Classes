public class Book {
    private final String title;
    private final Author author;
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


    @Override
    public String toString() {
        return author.toString();
    }


    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book darwin = (Book) other;
        return title.equals(darwin.title);
    }


    @Override
    public int hashCode() {
        return java.util.Objects.hash(title);
    }
}
