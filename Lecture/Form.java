import java.awt.*;
import javax.swing.*;
public class Form extends JFrame {
    private JTextField letLabel;
    private JPanel entryPanel;
    private JTextField name1;
  	private JTextField name2;
    private JComboBox maritalStatus;

    private static final int XSIZE = 1000;
	  private static final int YSIZE = 700;

    public Form(){
      Container cp = getContentPane();
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
      cp.setLayout(new FlowLayout());
    	cp.setBackground(Color.WHITE);
    	setTitle("Marital Form");
    	setSize(XSIZE,YSIZE);

      letLabel = new JLabel("First Name");
    	entryPanel.add(letLabel);
    	letLabel.setForeground(Color.GREEN);
        num1 = new JTextField("1st Number", 10);
    	entryPanel.add(num1);
     	num1.setBackground(Color. LIGHT_GRAY);
    }
}
