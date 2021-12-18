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
	private JLabel risingResultLabel;
	private JLabel mercuryResultLabel;
	private JLabel venusResultLabel;
	private JLabel marsResultLabel;
	private JLabel jupiterResultLabel;
	private JLabel saturnResultLabel;
	private JLabel uranusResultLabel;
	private JLabel neptuneResultLabel;
	private JLabel plutoResultLabel;
	private BufferedImage image;
	private CafeAstrologyUtility utility;
	private StringBuilder builder;
	
	public ResultPanel() {
		super(new GridLayout(2,1));
		this.setBackground(java.awt.Color.white);
        this.setPreferredSize(new java.awt.Dimension(1000, 1000));
        this.setSize(new java.awt.Dimension(1000, 1000));
        this.astrologyInfo = astrologyInfo;

    	String base64 = CafeAstrologyUtility.getSrcValue().substring(23, CafeAstrologyUtility.getSrcValue().length()-1);

      //  JLabel resultLabel = new JLabel("Results");
		//resultLabel.setBounds(0,15,100,50);
        //resultLabel.setFont(new Font(null,Font.PLAIN,25));
       // this.add(resultLabel, BorderLayout.NORTH);
      
        
        JPanel resultPanel = new JPanel(new GridLayout(12,1));
        sunResultLabel = new JLabel("Your sun sign is " + CafeAstrologyData.getSun());
        //sunResultLabel.setBounds(0,50,420,50);
        //sunResultLabel.setFont(new Font(null,Font.PLAIN,20));
        moonResultLabel = new JLabel("Your moon sign is " + CafeAstrologyData.getMoon());
        //moonResultLabel.setBounds(0,100,420,50);
        //moonResultLabel.setFont(new Font(null,Font.PLAIN,20));
		risingResultLabel = new JLabel("Your rising sign is " + CafeAstrologyData.getRising());

		mercuryResultLabel = new JLabel("Your mercury sign is " + CafeAstrologyData.getMercury());

		venusResultLabel = new JLabel("Your venus sign is " + CafeAstrologyData.getVenus());

		marsResultLabel = new JLabel("Your mars sign is " + CafeAstrologyData.getMars());

		jupiterResultLabel = new JLabel("Your jupiter sign is " + CafeAstrologyData.getJupiter());

		saturnResultLabel = new JLabel("saturn sun sign is " + CafeAstrologyData.getSaturn());

		uranusResultLabel = new JLabel("Your uranus sign is " + CafeAstrologyData.getUranus());

		neptuneResultLabel = new JLabel("Your neptune sign is " + CafeAstrologyData.getNeptune());

		plutoResultLabel = new JLabel("Your pluto sign is " + CafeAstrologyData.getPluto());

        resultPanel.add(sunResultLabel);
        resultPanel.add(moonResultLabel);
        resultPanel.add(risingResultLabel);
		resultPanel.add(mercuryResultLabel);
		resultPanel.add(venusResultLabel);
		resultPanel.add(marsResultLabel);
		resultPanel.add(jupiterResultLabel);
		resultPanel.add(saturnResultLabel);
		resultPanel.add(uranusResultLabel);
		resultPanel.add(neptuneResultLabel);
		resultPanel.add(plutoResultLabel);

        this.add(resultPanel);

    //    JButton button = new JButton("Learn More about your signs here!");
    //    this.add(button, BorderLayout.SOUTH);
        
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
        this.add(picture);

        
	}

}
