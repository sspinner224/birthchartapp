import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Base64;
import java.util.Base64.Decoder;

public class ResultPanel extends JPanel {
	
	private AstrologyInfo astrologyInfo;
	private JLabel sunResultLabel;
	private JLabel moonResultLabel;
	private BufferedImage image;
	private CafeAstrologyUtility utility;
	private StringBuilder builder;
	
	public ResultPanel() {
		super(new BorderLayout());
		this.setBackground(java.awt.Color.white);
        this.setPreferredSize(new java.awt.Dimension(500, 500));
        this.setSize(new java.awt.Dimension(500, 500));
        this.astrologyInfo = astrologyInfo;



    	String base64 = CafeAstrologyUtility.getSrcValue().substring(23, CafeAstrologyUtility.getSrcValue().length()-1);
    	System.out.println(base64);

    	

        
        JLabel resultLabel = new JLabel("Results");
		//resultLabel.setBounds(0,15,100,50);
        //resultLabel.setFont(new Font(null,Font.PLAIN,25));
        this.add(resultLabel, BorderLayout.NORTH);
      
        
        JPanel resultPanel = new JPanel(new GridLayout(2,1));
     //   sunResultLabel = new JLabel(astrologyInfo.getSunSign());
        //sunResultLabel.setBounds(0,50,420,50);
        //sunResultLabel.setFont(new Font(null,Font.PLAIN,20));
     //   moonResultLabel = new JLabel(astrologyInfo.getMoonSign());
        //moonResultLabel.setBounds(0,100,420,50);
        //moonResultLabel.setFont(new Font(null,Font.PLAIN,20));
    //    resultPanel.add(sunResultLabel);
    //    resultPanel.add(moonResultLabel);
        //this.add(resultPanel, BorderLayout.CENTER);
        JButton button = new JButton("Learn More about your signs here!");
        this.add(button, BorderLayout.SOUTH);
        
        try {
        	//Decoder decoder = Base64.getDecoder();
        	byte[] btDataFile = Base64.getDecoder().decode(base64);       
        	image = ImageIO.read(new ByteArrayInputStream(btDataFile));
        	JOptionPane.showMessageDialog(null, "", "Image", 
        	        JOptionPane.INFORMATION_MESSAGE, 
        	        new ImageIcon(image));
        } catch (IOException | NullPointerException e) {
        	e.printStackTrace();
        }
        
        JLabel picture = new JLabel(new ImageIcon(image));
        this.add(picture, BorderLayout.CENTER);
        
        
	}

}
