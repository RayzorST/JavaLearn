package lab6.Dog;

public class Germany implements Dog{
    String Name;

    public Germany(String name){
        Name = name;
    }
    public String getVoice() {
        return "R-r-r";
    }

    public String getName(){
        return Name;
    }
}
