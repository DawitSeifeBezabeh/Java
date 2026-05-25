// package swinglab; // Make sure this file is in a folder named 'swinglab'
import java.awt.*;
import javax.swing.*;

public class Calc extends JFrame {
    private JPanel entryPanel;
    private JPanel answerPanel;

    public Calc() {
        // Basic Frame Setup
        setTitle("My Funky Calculator");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.setBackground(Color.white);

        // Initialize Entry Panel
        entryPanel = new JPanel();
        entryPanel.setBackground(Color.red);
        // Added preferred size so the panel is visible in FlowLayout
        entryPanel.setPreferredSize(new Dimension(200, 200)); 
// Initialize Answer Panel
        answerPanel = new JPanel();
        answerPanel.setBackground(Color.green);
        answerPanel.setPreferredSize(new Dimension(200, 200));

        entryPanel1 = new JPanel();
        entryPanel1.setBackground(Color.orange);
        entryPanel1.setPreferredSize(new Dimension(200, 200));

        answerPanel1 = new JPanel();
        answerPanel1.setBackground(Color.orange);
        answerPanel1.setPreferredSize(new Dimension(200, 200));
        // Add panels to the container
        cp.add(entryPanel);
        cp.add(answerPanel);
        cp.add(entryPanel1);
        cp.add(answerPanel1);
    }    
 public static void main(String[] args) {
        // It's a Swing best practice to run the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            Calc trial = new Calc();
            trial.setVisible(true);
        });
    }
}
