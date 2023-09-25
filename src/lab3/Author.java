package lab3;

public class Author {
    private String Name;
    private String Email;
    private  char Gender;

    public Author(String name, String email, char gender){
        Name = name;
        Email = email;
        Gender = gender;
    }

    public String getName(){
        return Name;
    }

    public String getEmail(){
        return Email;
    }

    public char getGender(){
        return Gender;
    }

    public void setEmail(String email){
        Email = email;
    }

    public String toString(){
        return "Name: " + Name + " Email: " + Email + " Gender: " + Gender;
    }
}
