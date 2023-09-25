package lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program extends JFrame {
    JPanel[] pnl = new JPanel[25];
    private int Madrid = 0, Milan = 0;

    public static void main(String[] args) {
        new Program();
    }

    Program(){
        super("Football");
        setLayout(new GridLayout(5, 5));
        setSize(500, 300);

        for(int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            pnl[i].setLayout(new BorderLayout());
            add(pnl[i]);
        }

        JLabel Score = new JLabel("Score");
        JLabel ScoreMilan = new JLabel(" " + Milan);
        JLabel ScoreMadrid = new JLabel(" " + Madrid);
        Score.setFont(new Font("", Font.BOLD, 20));
        ScoreMilan.setFont(new Font("", Font.BOLD, 20));
        ScoreMadrid.setFont(new Font("", Font.BOLD, 20));

        JLabel LastScore = new JLabel("N/A");
        JLabel Winner = new JLabel("DRAW");

        pnl[2].add(Score, BorderLayout.CENTER);

        pnl[1].add(new JLabel("Milan"), BorderLayout.SOUTH);
        pnl[1].add(ScoreMilan, BorderLayout.CENTER);

        pnl[3].add(new JLabel("Madrid"), BorderLayout.SOUTH);
        pnl[3].add(ScoreMadrid, BorderLayout.CENTER);

        pnl[7].add(new JLabel("Last Scorer:"), BorderLayout.CENTER);
        pnl[7].add(LastScore, BorderLayout.SOUTH);

        pnl[12].add(new JLabel("Winner:"), BorderLayout.CENTER);
        pnl[12].add(Winner, BorderLayout.SOUTH);

        JButton milanButton = new JButton("AC Milan");
        pnl[21].add(milanButton, BorderLayout.CENTER);
        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Milan++;
                ScoreMilan.setText("" + Milan);
                LastScore.setText("AC Milan");
                if(Milan > Madrid + 5)
                    Winner.setText("AC MILAN");
            }
        });


        JButton madridButton = new JButton("Real Madrid");
        pnl[23].add(madridButton, BorderLayout.CENTER);
        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Madrid++;
                ScoreMadrid.setText("" + Madrid);
                LastScore.setText("Real Madrid");
                if(Madrid > Milan + 5)
                    Winner.setText("REAL MADRID");
            }
        });


        setVisible(true);
    }
}
