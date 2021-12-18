import javax.swing.JFrame;
import java.awt.*;

public class SecondWindow {
	
	private String nameValue;
	
	public SecondWindow(String nameValue) {

		JFrame frame = new JFrame();
		this.nameValue = nameValue;
		
		DrawingPanel drawingPanel = new DrawingPanel(nameValue);
		frame.add(drawingPanel);
//		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//		frame.setSize(screenSize.width, screenSize.height);
		frame.setSize(1000,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
