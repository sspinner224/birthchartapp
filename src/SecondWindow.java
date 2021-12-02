import javax.swing.JFrame;

public class SecondWindow {
	
	private String nameValue;
	
	public SecondWindow(String nameValue) {
		
		
		JFrame frame = new JFrame();
		this.nameValue = nameValue;
		
		DrawingPanel drawingPanel = new DrawingPanel(nameValue);
		frame.add(drawingPanel);
		
		
		
		
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
