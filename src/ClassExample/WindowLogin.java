package ClassExample;

/**
 * 
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 * @author Vinay
 *
 */
public class WindowLogin extends JFrame implements ActionListener{

	/**
	 * 
	 */
	 Container container; 
	 JLabel lblUser=new JLabel("User Name");   
	 JLabel lblPass =new JLabel("Password"); 
	 JTextField txtUser=new JTextField();  
	 JPasswordField txtPass=new JPasswordField(); 
	 JButton btnLogin=new JButton("Sign In");
	 
	public WindowLogin() {
		// TODO Auto-generated constructor stub
		
		container=this.getContentPane();   
		container.setLayout(null);    
		container.setBackground(Color.CYAN);   
		 
		lblUser.setBounds(100,50,100,40);     
		lblPass.setBounds(100,140,100,40);
		txtUser.setBounds(250,50,200,40);
		txtPass.setBounds(250,140,200,40); 
		btnLogin.setBounds(280,250,140,50);
		
		btnLogin.addActionListener(this);
		
		lblUser.setFont(new Font("Arial", Font.BOLD,18));
		lblPass.setFont(new Font("Arial", Font.BOLD,18));
		 
		container.add(lblUser);
		container.add(lblPass);
		container.add(txtUser);
		container.add(txtPass);
		container.add(btnLogin);
	}

	public void actionPerformed(ActionEvent e){
	 	String userName=txtUser.getText();
	 	String passWord=txtPass.getText();

	 	if (e.getSource()==btnLogin)
	 	{ 
	 		if(userName.equals("abc")&&(passWord.equals("123")))
	 		{
	 		JOptionPane.showMessageDialog(this,"Successfully Logged In", "Welcome",JOptionPane.INFORMATION_MESSAGE);
	    
	 		}
	 		else
	 		{
	 			JOptionPane.showMessageDialog(this,"Invalid Credentials", "Error",JOptionPane.ERROR_MESSAGE);
	 		}
	      }
	   }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WindowLogin login=new WindowLogin();   
		 login.setVisible(true);
		 login.setTitle("Window Login");
		 login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 login.setBounds(200,100,800,600);

	}

}
