package ClassExample;

/**
 * 
 */
import java.awt.*;
import javax.swing.*;

/**
 * @author Vinay
 *
 */
public class MyWindow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  JFrame frame = new JFrame("My Window");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      JLabel textLabel = new JLabel("This is a sample window",SwingConstants.CENTER);
	      textLabel.setPreferredSize(new Dimension(500, 300));
	      frame.getContentPane().add(textLabel, BorderLayout.CENTER);
	      //Display the window.
	      frame.setLocationRelativeTo(null);
	      frame.pack();
	      frame.setVisible(true);

	}

}
