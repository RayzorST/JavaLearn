package lab9;

public class Dog implements Nameable {
    private String Name;

    public  Dog(String name){
        Name = name;
    }

    public void setName(String name){
        Name = name;
    }

    public String getName(){
        return Name;
    }
}
