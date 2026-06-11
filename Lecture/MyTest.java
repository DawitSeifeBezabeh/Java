import java.awt.*;
import javax.swing.*;

public class MyTest extends JFrame {
 	JLabel myLabel = new JLabel("Hello, World!");
 
 	public MyTest() {
   	super("MyTest");
    	setSize(350, 100);
     	getContentPane().add(myLabel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

 	}

 	public static void main (String args[]) {
    	MyTest m = new MyTest();
 	}
}
