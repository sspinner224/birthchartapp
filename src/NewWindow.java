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

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

}
