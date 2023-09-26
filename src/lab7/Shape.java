package lab7;

import javax.swing.*;
import java.awt.*;

public abstract class Shape {
    int Position;
    Color Color;

    public Shape(){
        Position = (int)(Math.random() * 100);
        Color = RandomColor();
    }

    private Color RandomColor(){
        int num = (int) (Math.random() * 10);
        return switch (num) {
            case 1 -> Color.BLACK;
            case 2 -> Color.WHITE;
            case 3 -> Color.RED;
            case 4 -> Color.BLUE;
            case 5 -> Color.GREEN;
            default -> Color.CYAN;
        };
    }
}
