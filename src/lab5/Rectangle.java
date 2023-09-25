package lab5;

public class Rectangle extends Shape{
    protected double Width;
    protected double Length;

    public Rectangle(){
        Width = 0;
        Length = 0;
    }

    public  Rectangle(double width, double length){
        Width = width;
        Length = length;
    }

    public Rectangle(double width, double length, String color, Boolean filled){
        Width = width;
        Length = length;
        Color = color;
        Filled = filled;
    }

    public double getWidth(){
        return Width;
    }

    public  double getLength(){
        return Length;
    }

    public  void setWidth(double width){
        Width = width;
    }

    public void setLength(double length){
        Length = length;
    }

    public double getArea() {
        return Width * Length;
    }

    public double getPerimetr() {
        return 2 * (Width + Length);
    }

    public String toString() {
        return "Color: " + Color + "Filled: " + Filled + " Width: " + Width + " Length: " + Length;
    }
}
