import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NewWindow {
	
	private AstrologyInfo astrologyInfo;
	
	
	private JLabel sunResultLabel;
	private JLabel moonResultLabel;
	
	
	public NewWindow(AstrologyInfo astrologyInfo) {
		
		
		
		JFrame frame = new JFrame("Results");
		
		this.astrologyInfo = astrologyInfo;
		
		
	   
	  
		JLabel resultLabel = new JLabel("Results:");
		resultLabel.setBounds(0,15,100,50);
        resultLabel.setFont(new Font(null,Font.PLAIN,25));
        frame.add(resultLabel);
        sunResultLabel = new JLabel(astrologyInfo.getSunSign());
        sunResultLabel.setBounds(0,50,420,50);
        sunResultLabel.setFont(new Font(null,Font.PLAIN,20));
        moonResultLabel = new JLabel(astrologyInfo.getMoonSign());
        moonResultLabel.setBounds(0,100,420,50);
        moonResultLabel.setFont(new Font(null,Font.PLAIN,20));
        frame.add(sunResultLabel);
        frame.add(moonResultLabel);
    
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
		
	}

}
