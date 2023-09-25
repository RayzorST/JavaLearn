package lab5;

public class MovableRactangle implements Movable{
    private MovablePoint topLeft, bottomRight;
    public MovableRactangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y2, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private Boolean oneSpeed(){
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }
    public void moveUp() {
        topLeft.Y += topLeft.ySpeed;
        bottomRight.Y += bottomRight.ySpeed;
    }

    public void moveDown() {
        topLeft.Y -= topLeft.ySpeed;
        bottomRight.Y -= bottomRight.ySpeed;
    }

    public void moveLeft() {
        topLeft.X -= topLeft.xSpeed;
        bottomRight.X -= bottomRight.xSpeed;
    }

    public void moveRight() {
        topLeft.X += topLeft.xSpeed;
        bottomRight.X += bottomRight.xSpeed;
    }
}
