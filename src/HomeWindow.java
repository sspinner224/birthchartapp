import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HomeWindow extends JPanel{
	
	private JLabel nameLabel;
	private JLabel astrologyLabel;
	private JLabel authorLabel;
	private String nameValue;

	public String getNameValue() {
		return nameValue;
	}

	public HomeWindow() {
		
		super(new GridLayout(10,30));
		//JFrame frame = new JFrame("Astrology");
	//	this.setSize(1500,500);
		
		astrologyLabel = new JLabel("Discover Your Birth Chart!");
		authorLabel = new JLabel("By: Sadjell and Samantha");

		astrologyLabel.setFont(new Font(null,Font.PLAIN,25));
		authorLabel.setFont(new Font(null,Font.PLAIN,15));

		nameLabel = new JLabel("Enter your name below: ");
		nameLabel.setFont(new Font(null,Font.PLAIN,25));
		
		JTextField textField = new JTextField();
		this.add(astrologyLabel);
		this.add(authorLabel);
		this.add(nameLabel);
		this.add(textField);
		JButton startButton = new JButton("Press to start");
		startButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				nameValue = textField.getText();
				if(e.getSource() == startButton) {
	            	  SecondWindow secondWindow = new SecondWindow(nameValue);
	              }
				
			}
			
		});
		this.add(startButton);
	}

}
