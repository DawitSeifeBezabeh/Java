import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Calculator extends JFrame {

    private JLabel letLabel;
    private JLabel answerLabel;
    private JTextField num1;
    private JTextField num2;
    private JComboBox operation;
    private JButton calculate;
    private JButton answerBtn;
    private JButton quit;
    private JPanel entryPanel;
    private JLabel resultBox;

    static final String ADD_OP = "ADDITION";
    static final String SUB_OP = "SUBTRACTION";
    static final String MUL_OP = "MULTIPLICATION";
    static final String DIV_OP = "DIVISION";
    private static final int XSIZE = 1000;
    private static final int YSIZE = 700;

    private double storedResult = 0;
    private boolean calculated = false;

    public Calculator() {
        Container cp = getContentPane();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.setLayout(new BorderLayout());
        cp.setBackground(Color.WHITE);
        setTitle("My Funky Calculator");
        setSize(XSIZE, YSIZE);

        entryPanel = new JPanel(new FlowLayout());
        entryPanel.setBackground(Color.ORANGE);

        letLabel = new JLabel("Let's Calculate!");
        letLabel.setForeground(Color.GREEN);
        entryPanel.add(letLabel);

        num1 = new JTextField("", 10);
        num1.setBackground(Color.LIGHT_GRAY);
        entryPanel.add(num1);

        num2 = new JTextField("", 10);
        num2.setBackground(Color.LIGHT_GRAY);
        entryPanel.add(num2);

        operation = new JComboBox();
        operation.addItem(ADD_OP);
        operation.addItem(SUB_OP);
        operation.addItem(MUL_OP);
        operation.addItem(DIV_OP);
        operation.setBackground(Color.BLUE);
        entryPanel.add(operation);

        calculate = new JButton("Calculate");
        calculate.setBackground(Color.PINK);
        entryPanel.add(calculate);

        answerBtn = new JButton("Answer");
        answerBtn.setBackground(Color.CYAN);
        entryPanel.add(answerBtn);

        quit = new JButton("Quit");
        quit.setBackground(new Color(50, 100, 50));
        entryPanel.add(quit);

        resultBox = new JLabel(" ", SwingConstants.CENTER);
        resultBox.setOpaque(true);
        resultBox.setBackground(Color.WHITE);
        resultBox.setForeground(Color.BLUE);
        resultBox.setFont(new Font("Arial", Font.BOLD, 22));
        resultBox.setPreferredSize(new Dimension(900, 60));
        resultBox.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));

        JPanel resultPanel = new JPanel(new FlowLayout());
        resultPanel.setBackground(Color.WHITE);
        resultPanel.add(resultBox);

        // --- Add panels to frame ---
        cp.add(entryPanel, BorderLayout.NORTH);
        cp.add(resultPanel, BorderLayout.CENTER);

        // --- Listeners ---
        calculate.addActionListener(e -> {
    try {
        double n1 = Double.parseDouble(num1.getText().trim());
        double n2 = Double.parseDouble(num2.getText().trim());
        String op = (String) operation.getSelectedItem();

        if (op.equals(DIV_OP) && n2 == 0) {
            JOptionPane.showMessageDialog(this, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
            calculated = false;
            return;
        }

        switch (op) {
            case ADD_OP: storedResult = n1 + n2; break;
            case SUB_OP: storedResult = n1 - n2; break;
            case MUL_OP: storedResult = n1 * n2; break;
            case DIV_OP: storedResult = n1 / n2; break;
        }

        calculated = true;

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
        calculated = false;
    }
});

answerBtn.addActionListener(e -> {
    if (!calculated) {
        JOptionPane.showMessageDialog(this, "Press Calculate first!", "Info", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
    String result = (storedResult == (long) storedResult)
            ? String.valueOf((long) storedResult)
            : String.valueOf(storedResult);
    resultBox.setText(operation.getSelectedItem() + "  =  " + result);
});

quit.addActionListener(e -> System.exit(0));
    }

    public static void main(String[] args) {
        Calculator trial = new Calculator();
        trial.setVisible(true);
    }
}