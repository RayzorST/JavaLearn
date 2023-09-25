package lab1;

public class Ball {
    BallType Type;
    int Radius;

    Ball(BallType type, int radius){
        Type = type;
        Radius = radius;
    }

    public void setType(BallType type){
        Type = type;
    }

    public void setRadius(int radius){
        Radius = radius;
    }

    public BallType getType(){
        return Type;
    }

    public int getRadius(){
        return Radius;
    }

    public String toString(){
        return "Ball type: " + Type + " radius: " + Radius;
    }

    public static  String toString(Ball ball){
        return "Ball type: " + ball.Type + " radius: " + ball.Radius;
    }
}
