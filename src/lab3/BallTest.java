package lab3;

public class BallTest {
    public static  void main(String[] args){
        Ball ball = new Ball(0 ,0);
        System.out.println(ball.toString());
        ball.move(23, -4);
        System.out.println(ball.toString());
    }
}
