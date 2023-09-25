package lab4.Book;

public class Book {
    private String[] Autors;
    private String Name;
    private int Year;

    public Book(String autor, String name, int year){
        Autors = new String[1];
        Autors[0] = autor;
        Name = name;
        Year = year;
    }

    public Book(String[] autors, String name, int year){
        Autors = autors;
        Name = name;
        Year = year;
    }

    public String getAutors(){
        String res = "";
        for(String a : Autors) res += (a + " ");
        return  res;
    }

    public String getName(){
        return Name;
    }

    public int getYear() {
        return Year;
    }

    public void setName(String name){
        Name = name;
    }

    public void setYear(int year){
        Year = year;
    }

    public void setAutor(String autor){
        Autors = new String[1];
        Autors[0] = autor;
    }

    public String toString(){
        return "Book: " + Name + "\n Year: " + Year + "\nAutors: " + getAutors();
    }
}
