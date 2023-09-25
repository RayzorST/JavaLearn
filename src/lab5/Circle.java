package lab5;

public class Circle extends Shape{
    private double Radius;
    public Circle(){
        Radius = 0;
    }

    public Circle(double radius){
        Radius = radius;
    }

    public Circle(double radius, String color, Boolean filled){
        Radius = radius;
        Color = color;
        Filled = filled;
    }

    public double getRadius(){
        return Radius;
    }

    public void setRadius(double radius){
        Radius = radius;
    }

    public double getArea(){
        return 3.14 * (Radius * Radius);
    }

    public double getPerimetr(){
        return 2 * 3.14 * Radius;
    }

    public String toString(){
        return "Color: " + Color + " Filled: " + Filled + " Radius: " + Radius;
    }
}
