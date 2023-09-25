package lab5;

public abstract class Shape {
    protected String Color;
    protected Boolean Filled;

    public Shape(){
        Color = "None";
        Filled = false;
    }

    public Shape(String color, Boolean filled){
        Color = color;
        Filled = filled;
    }

    public String getColor(){
        return Color;
    }

    public Boolean isFilled(){
        return Filled;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setFilled(Boolean filled){
        Filled = filled;
    }

    public abstract double getArea();
    public abstract  double getPerimetr();

    public abstract String toString();
}
