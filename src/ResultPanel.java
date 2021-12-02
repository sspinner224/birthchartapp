import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ResultPanel extends JPanel {
	
	private AstrologyInfo astrologyInfo;
	private JLabel sunResultLabel;
	private JLabel moonResultLabel;
	
	public ResultPanel(AstrologyInfo astrologyInfo) {
		super(new BorderLayout());
		this.setBackground(java.awt.Color.white);
        this.setPreferredSize(new java.awt.Dimension(500, 500));
        this.setSize(new java.awt.Dimension(500, 500));
        this.astrologyInfo = astrologyInfo;
        
        JLabel resultLabel = new JLabel("Results");
		//resultLabel.setBounds(0,15,100,50);
        //resultLabel.setFont(new Font(null,Font.PLAIN,25));
        this.add(resultLabel, BorderLayout.NORTH);
        
        JPanel resultPanel = new JPanel(new GridLayout(2,1));
        sunResultLabel = new JLabel(astrologyInfo.getSunSign());
        //sunResultLabel.setBounds(0,50,420,50);
        //sunResultLabel.setFont(new Font(null,Font.PLAIN,20));
        moonResultLabel = new JLabel(astrologyInfo.getMoonSign());
        //moonResultLabel.setBounds(0,100,420,50);
        //moonResultLabel.setFont(new Font(null,Font.PLAIN,20));
        resultPanel.add(sunResultLabel);
        resultPanel.add(moonResultLabel);
        this.add(resultPanel, BorderLayout.CENTER);
        JButton button = new JButton("Learn More about your signs here!");
        this.add(button, BorderLayout.SOUTH);
        
        
	}

}
