package lab5;

public class MovablePoint implements Movable {

    protected int X, Y;
    protected int xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        X = x;
        Y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString(){
        return "Coords X: " + X + " Y: " + Y + "\nSpeed X: " + xSpeed + " Y: " + Y;
    }

    public void moveUp() {
        Y += ySpeed;
    }

    public void moveDown() {
        Y -= ySpeed;
    }

    public void moveLeft() {
        X -= xSpeed;
    }

    public void moveRight() {
        X += xSpeed;
    }
}
