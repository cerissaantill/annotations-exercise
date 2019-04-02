public class Main {
    public static void main(String[] args) {
        Author author = new Author("Sandi", "Metz");    // creating author object

        author.addBook("Practical Object-Oriented Design in Ruby");     // adding books by that author
        author.addBook("99 Bottles of OOP");

        for (String book: author.getBooks()) {      // looping through list of books on Author object
            System.out.println(book);
        }
    }
}
