public class Main {
    public static void main(String[] args) {
        Author authors = new Author("Philip", "Dick");
        System.out.println("authors.getName() = " + authors.getName());
        System.out.println("authors.getSurname() = " + authors.getSurname());


        Book theFirstBook = new Book("Ubik", authors
                /*Не понимаю, как указать точно Ф.И., вместо ссылки на них.*/
                , 1968);
        System.out.println("theFirstBook.getTitle() = " + theFirstBook.getTitle());
        System.out.println("theFirstBook.getAuthor() = " + theFirstBook.getAuthor());
        theFirstBook.setDateOfPublication(1969);
        System.out.println("theFirstBook.getDateOfPublication() = " +
                theFirstBook.getDateOfPublication());
    }
}