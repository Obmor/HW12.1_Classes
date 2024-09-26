public class Main {
    public static void main(String[] args) {
        System.out.println();
// Authors
        Author dick = new Author("Philip", "Dick");
        Author darwin = new Author("Charles", "Darwin");
//
// The First Book
        Book theFirstBook = new Book("Ubik", dick, 1968);
        System.out.println("theFirstBook.getTitle() = " + theFirstBook.getTitle());
        System.out.println("theFirstBook.getAuthor() = "
                + theFirstBook.getAuthor().getName()
                + " "
                + theFirstBook.getAuthor().getSurname());
        theFirstBook.setDateOfPublication(1969);
        System.out.println("theFirstBook.getDateOfPublication() = " +
                theFirstBook.getDateOfPublication());
        System.out.println();
//
// The Second Book
        Book theSecondBook = new Book("On the Origin of Species",
                darwin, 1859);
        System.out.println("theSecondBook.getTitle() = " + theSecondBook.getTitle());
        System.out.println("theSecondBook.getAuthor() = "
                + theSecondBook.getAuthor().getName()
                + " "
                + theSecondBook.getAuthor().getSurname());
        System.out.println("theSecondBook.getDateOfPublication() = " +
                theSecondBook.getDateOfPublication());
    }
}