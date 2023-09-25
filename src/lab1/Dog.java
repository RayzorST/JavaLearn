package lab1;

public class Dog {
    private String Name;
    private int Age;

    public Dog(String name, int age){
        Name = name;
        Age = age;
    }

    public String getName(){
        return Name;
    }

    public int getAge(){
        return Age;
    }

    public void setName(String name){
        Name = name;
    }

    public void setAge(int age){
        Age = age;
    }

    public int DogAgeToHuman(){
        return Age * 7;
    }

    public static int DogAgeToHuman(int age){
        return age * 7;
    }

    public String toString(){
        return "Name: " + Name + ", Age: " + Age;
    }
}
