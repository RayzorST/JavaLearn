package lab4.Circle;

public class Circle {
    private int radius;

    public Circle(){radius = 0;}

    public Circle(int r) {radius = r;}

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r){
        radius = r;
    }

    public int Perimetr(){
        return (int) (3.14 * 2 * radius);
    }

    public int Square(){
        return (int) (3.14) * (radius * radius);
    }
}
