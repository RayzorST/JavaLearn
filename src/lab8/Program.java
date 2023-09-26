package lab8;

import javax.swing.*;
import java.awt.*;

public class Program extends JFrame{
    public static void main(String[] args) { new Program(); }

    JPanel[] pnl = new JPanel[100];
    public Program(){
        super("Program");

        setLayout(new GridLayout(5, 5));
        setSize(500, 500);

        for(int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            pnl[i].setLayout(new BorderLayout());
            add(pnl[i]);
        }

        setVisible(true);
    }
}
