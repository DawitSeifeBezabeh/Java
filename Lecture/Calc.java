import java.awt.*;
import java.util.Scanner;
import javax.swing.*;
import java.util.*;

public class Calc extends JFrame{
    
 	private JLabel letLabel;
 	private JLabel answerLabel;
  	private JTextField num1;
  	private JTextField num2;
  	private JComboBox operation;
  	private JButton calculate;
  	private JButton quit;
  	private JPanel entryPanel;
  	private JPanel answerPanel;

    static final String ADD_OP = "ADDITION";
    static final String SUB_OP = "SUBTRACTION";
  	static final String MUL_OP = "MULTIPLICATION";
  	static final String DIV_OP = "DIVISION";

    private static final int XSIZE = 1000;
	private static final int YSIZE = 700;
    
 	public Calc() {
   	Container cp = getContentPane();
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
      cp.setLayout(new FlowLayout());
    	cp.setBackground(Color.RED);
    	setTitle("My Funky Calculator");
    	setSize(XSIZE,YSIZE);
        
     	entryPanel = new JPanel();
		entryPanel.setBackground(Color.ORANGE);
        
   	  answerPanel = new JPanel();
      answerPanel.setBackground(Color.YELLOW);

      letLabel = new JLabel("Let's Calculate!");
    	entryPanel.add(letLabel);
    	letLabel.setForeground(Color.GREEN);
		Scanner kbr = new Scanner();
		 num1 = nextInt();
        num1 = new JTextField("1st Number", 10);
    	entryPanel.add(num1);
		System.out.println(num1);
     	num1.setBackground(Color. LIGHT_GRAY);
        
     	num2= new JTextField("2nd Number", 10);
     	entryPanel.add(num2);
		System.out.println(num2);
    	num2.setBackground(Color.LIGHT_GRAY);
        
     	operation = new JComboBox();
     	operation.addItem(ADD_OP);
     	operation.addItem(SUB_OP);
     	operation.addItem(MUL_OP);
     	operation.addItem(DIV_OP); 
     	entryPanel.add(operation);
     	operation.setBackground(Color.GREEN);
        
     	answerLabel = new JLabel("Answer");
        entryPanel.add(answerLabel);
    	answerLabel.setForeground(Color.red);		
		calculate = new JButton("Calculate");
     	calculate.setBackground(Color.pink);
     	answerPanel.add(calculate);
        
    	quit = new JButton("Quit");
     	answerPanel.add(quit);
     	Color quitter = new Color(50,100,50);
    	quit.setBackground(quitter);
        
		cp.add(entryPanel);
    	cp.add(answerPanel);
                
  	}
	public static void main(String[] args){
     	Calc trial = new Calc();
     	trial.setVisible(true);
  	}
    
}
