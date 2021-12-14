import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Dimension;

public class NewWindow {
	
	private AstrologyInfo astrologyInfo;
	private JLabel sunResultLabel;
	private JLabel moonResultLabel;


	public NewWindow() {
		
		JFrame frame = new JFrame("Results");
		

		
		ResultPanel resultPanel = new ResultPanel();
		frame.add(resultPanel);
//		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//		frame.setSize(screenSize.width/2, screenSize.height/2);

		/*
		JLabel resultLabel = new JLabel("Results");
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
        JButton button = new JButton("Learn More about your signs here!");
        frame.add(button);
        */

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

}
