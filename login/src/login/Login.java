package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener {

	private static JLabel userlabel;
	private static JLabel pwlabel;
	private static JLabel success;
	private static JTextField userid;
	private static JPasswordField password;
	private static JButton button;
	
	
	 public static void main(String[]args) {
		JFrame frame=new JFrame("LOGIN");
		JPanel panel=new JPanel();
		frame.setSize(450,225);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		panel.setSize(150,125);
		
		userlabel=new JLabel("USER NAME");
		userlabel.setBounds(10,20,100,65);
		panel.add(userlabel);
		
		pwlabel=new JLabel("PASSWORD");
		pwlabel.setBounds(10,60,100,65);
		panel.add(pwlabel);
		
		userid=new JTextField(20);
		userid.setBounds(100,40,165,25);
		panel.add(userid);
		
		password=new JPasswordField(20);
		password.setBounds(100,80,165,25);
		panel.add(password);
		
		button=new JButton("LOGIN");
		button.setBounds(140,125, 75, 25);
		button.addActionListener(new Login());
		panel.add(button);		
		
		success=new JLabel("");
	    success.setBounds(130, 150, 125, 20);
		panel.add(success);
		
		frame.setVisible(true);
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
	 String user=userid.getText();
	 String ps=password.getText();
	 
	 if(user.equals("sairam")&& ps.equals("1234")) {
		 success.setText("login successful");
	 }
		
	 else {
		 success.setText("wrong id or password");
	 }
	}
	 
	
}	