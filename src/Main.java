import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Card extends JFrame implements ActionListener {
    private final JButton btnTriangle;
    private final JButton btnCircle;
    private final JButton btnRectangle;
    private final JButton btnClear;
    private final JPanel cardPanel;
    private final CardLayout cardLayout;

    public  Card(){
        setTitle("CardLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);

        // Create panels with cards
        cardPanel = new JPanel(new CardLayout());

        // Create button panel
        JPanel buttonPanel = new JPanel(new FlowLayout());

        btnTriangle = new JButton("Triangle");
        btnTriangle.addActionListener(this);
        btnCircle = new JButton("Circle");
        btnCircle.addActionListener(this);
        btnRectangle = new JButton("Rectangle");
        btnRectangle.addActionListener(this);
        btnClear = new JButton("Clear");
        btnClear.addActionListener(this);
        buttonPanel.add(btnRectangle);
        buttonPanel.add(btnTriangle);
        buttonPanel.add(btnCircle);
        buttonPanel.add(btnClear);

        // Add panels to JFrame
        getContentPane().add(cardPanel, BorderLayout.CENTER);

        getContentPane().add(buttonPanel, BorderLayout.NORTH);

        cardLayout = (CardLayout) cardPanel.getLayout();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cardPanel.add(new JadiSatu.Rectangle(), "Rectangle");
        cardPanel.add(new JadiSatu.Triangle(), "Triangle");
        cardPanel.add(new JadiSatu.Circle(), "Circle");

        if (e.getSource() == btnTriangle) {
            cardLayout.show(cardPanel, "Triangle");
        } else if (e.getSource() == btnRectangle) {
            cardLayout.show(cardPanel, "Rectangle");
        }  else if (e.getSource() == btnCircle) {
            cardLayout.show(cardPanel, "Circle");
        }  else if (e.getSource() == btnClear) {
            cardPanel.removeAll();
        }
        cardPanel.repaint();
        cardPanel.revalidate();
    }
}

public class Main {

    public static void main(String[] args) {
      new Card();
    }
}