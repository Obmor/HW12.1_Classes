public class Main {
    public static void main(String[] args) {
        System.out.println();
// Authors
        Author dick = new Author("Philip", "Dick");
        Author darwin = new Author("Philip", "Darwin");
        /* В 6й строке имя скопированно из 5й строки для проверки соответствия через
         метода EQUALS. 22я строка изменена по той же логике.
         */
//
// The First Book
        Book theFirstBook = new Book("Ubik", dick, 1968);
        System.out.println("theFirstBook.getTitle() = " + theFirstBook.getTitle());
//  Метод toString
        System.out.println("theFirstBook.getAuthor() = " + theFirstBook.getAuthor());
        theFirstBook.setDateOfPublication(1969);
        System.out.println("theFirstBook.getDateOfPublication() = " +
                theFirstBook.getDateOfPublication());
        System.out.println();
//
// The Second Book
        Book theSecondBook = new Book("Ubik", // On the Origin of Species
                darwin, 1859);
        System.out.println("theSecondBook.getTitle() = " + theSecondBook.getTitle());
// Метод toString
        System.out.println("theSecondBook.getAuthor() = " + theSecondBook.getAuthor());
        System.out.println("theSecondBook.getDateOfPublication() = " +
                theSecondBook.getDateOfPublication());
        System.out.println();
//
// Метод toEquals
        System.out.println(theFirstBook.equals(theSecondBook));
        System.out.println(dick.equals(darwin));
        System.out.println();
//
// Метод hashCode
        System.out.println(theFirstBook.hashCode());
        System.out.println(theSecondBook.hashCode());
    }
}
