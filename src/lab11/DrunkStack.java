package lab11;

import java.util.Scanner;

public class DrunkStack {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cards for p1: ");
        String buf = scanner.next();
        PlayerStack p1 = new PlayerStack(buf);

        System.out.print("Cards for p2: ");
        buf = scanner.next();
        PlayerStack p2 = new PlayerStack(buf);

        int numMove = 0;

        while (!p1.isEmpty() & !p2.isEmpty()){
            System.out.println("------------------");
            System.out.println("Move " + numMove);
            Move(p1, p2);
            numMove++;
            if(numMove >= 106){
                System.out.println("botva");
                break;
            }
        }
    }

    public static void Move(PlayerStack p1, PlayerStack p2){
        int a = p1.getUpCard();
        int b = p2.getUpCard();

        System.out.println("p1: " + a + " | p2: " + b);

        if(a == 0 & b == 9){
            p1.addCards(a, b);
            System.out.println("Win p1");
        }
        else if(a == 9 & b == 0){
            p2.addCards(a, b);
            System.out.println("Win p2");
        }
        else{
            if(a > b){
                p1.addCards(a, b);
                System.out.println("Win p1");
            }
            else{
                p1.addCards(a, b);
                System.out.println("Win p2");
            }
        }

    }
}
