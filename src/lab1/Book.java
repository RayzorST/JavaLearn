package lab1;

public class Book {
    private BookType Type;
    private String Name;
    private int Pages;

    public Book(String name, int pages, BookType type) {
        Name = name;
        Pages = pages;
        Type = type;
    }

    public String getName() {
        return Name;
    }

    public int getPages() {
        return Pages;
    }

    public BookType getType() {
        return Type;
    }

    public void setName(String name){
        Name = name;
    }

    public void setPages(int pages){
        Pages = pages;
    }

    public void setType(BookType type){
        Type = type;
    }

    public String toString(){
        return "Name: " + Name + "\nPages: " + Pages + "\nBook type: " + Type;
    }
}
