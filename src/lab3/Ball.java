package lab3;

public class Ball {
    private double X;
    private double Y;
    public Ball(double x, double y){
        X = x;
        Y = y;
    }

    public double getX(){
        return X;
    }

    public double getY(){
        return Y;
    }

    public void setX(double x){
        X = x;
    }

    public void setY(double y){
        Y = y;
    }

    public void setXY(double x, double y){
        X = x;
        Y = y;
    }

    public void move(double x, double y){
        X += x;
        Y += y;
    }

    public String toString(){
        return "Ball X: " + X + " Y: " + Y;
    }
}
