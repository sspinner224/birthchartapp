import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NewWindow {
	
	private AstrologyInfo astrologyInfo;
	private JLabel sunSignLabel;
	//private JLabel sunResultLabel;
	
	
	public NewWindow(AstrologyInfo astrologyInfo) {
		
		
		
		JFrame frame = new JFrame("Results");
		
		this.astrologyInfo = astrologyInfo;
		
		sunSignLabel = new JLabel("Your sun sign is: " + astrologyInfo.getSunSign());
		sunSignLabel.setBounds(0,0,100,50);
		sunSignLabel.setFont(new Font(null,Font.PLAIN,25));
		frame.add(sunSignLabel);
		
		/*
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		
		JLabel resultLabel = new JLabel("Results:");
		resultLabel.setBounds(0,50,100,50);
        resultLabel.setFont(new Font(null,Font.PLAIN,5));
        mainPanel.add(resultLabel, BorderLayout.NORTH);
        JPanel infoPanel = new JPanel(new GridLayout(2,2));
		
        sunSignLabel = new JLabel("Your sun sign is: ");
        sunSignLabel.setBounds(50,100,100,50);
        sunSignLabel.setFont(new Font(null,Font.PLAIN,10));
        sunResultLabel = new JLabel(astrologyInfo.getSunSign());
        sunResultLabel.setBounds(100,150,100,50);
        sunResultLabel.setFont(new Font(null,Font.PLAIN,10));
        
        infoPanel.add(sunSignLabel);
        infoPanel.add(sunResultLabel);
        
        mainPanel.add(infoPanel, BorderLayout.CENTER);
        
        
        //sunSignLabel.setBounds(0,0,100,50);
       
        frame.add(mainPanel);
        
        */
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
		
	}

}
