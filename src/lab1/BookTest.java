package lab1;

public class BookTest {
    public static void main(String[] args){
        Book book1 = new Book("WarAndPeace", 1000, BookType.Tree);
        Book book2 = new Book("KRD", 100, BookType.Comic);
        Book book3 = new Book("Kakay to kniga", 10, BookType.Comedy);
        System.out.println(book1.toString());
        book2.setPages(10000);
        System.out.println((book2.getName() + " " + book2.getPages()));
        book3.setName("ne smeshno");
        System.out.println(book3.getName() + " " + book3.getType());
    }
}
