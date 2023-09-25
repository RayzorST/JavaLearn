package lab5;

public class MovableCircle implements Movable{
    private int Radius;
    private MovablePoint Center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        Radius = radius;
        Center = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    public void moveUp() {
        Center.Y += Center.ySpeed;
    }

    public void moveDown() {
        Center.Y -= Center.ySpeed;
    }

    public void moveLeft() {
        Center.X -= Center.xSpeed;
    }

    public void moveRight() {
        Center.X -= Center.xSpeed;
    }
}
