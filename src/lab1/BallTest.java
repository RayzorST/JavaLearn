package lab1;

public class BallTest {
    public static void main(String[] args){
        Ball ball1 = new Ball(BallType.FootBall, 5);
        Ball ball2 = new Ball(BallType.Basketball, 5);
        Ball ball3 = new Ball(BallType.pinpong, 2);
        System.out.println(ball1.toString());
        System.out.println(Ball.toString(ball2));
        ball3.setRadius(1);
        System.out.println(ball3.getType() + " " + ball3.getRadius());
    }
}
