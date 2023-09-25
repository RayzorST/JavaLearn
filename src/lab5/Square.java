package lab5;

public class Square extends Rectangle{
    public Square(){
        Length = 0;
        Width = 0;
    }

    public Square(double side){
        Length = side;
        Width = side;
    }

    public Square(double side, String color, Boolean filled){
        Length = side;
        Width = side;
        Color = color;
        Filled = filled;
    }
}
