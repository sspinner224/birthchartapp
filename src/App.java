import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class App extends JFrame {

    public App(){
        super("Birth Chart App");
        this.setSize(500, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel background=new JLabel(new ImageIcon("C:\\Users\\Computer\\Downloads\\colorful_design.png"));
    }
    public static void main(String[] args) {
        new App();
    }

}
