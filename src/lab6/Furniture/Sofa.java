package lab6.Furniture;

public class Sofa implements Furniture{
    String Name;
    float Width, Length, Height;

    public Sofa(){
        Name = "Sofa";
        Width = 1000;
        Length = 40;
        Height = 60;
    }

    public Sofa(String name, float width, float length, float height){
        Name = name;
        Width = width;
        Length = length;
        Height = height;
    }

    public String getName() {
        return Name;
    }

    public float getWidth() {
        return Width;
    }

    public float getLength() {
        return Length;
    }

    public float getHeight() {
        return Height;
    }
}
