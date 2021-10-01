import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;


public class App extends JFrame {

    private BufferedImage starrySky;

    public App(){
        super("Birth Chart App");
        this.setSize(500, 400);
        this.setVisible(true);

        JLabel background = new JLabel();
        try {
            starrySky = ImageIO.read(new File("src/starrysky.jpeg"));
        } catch (IOException | NullPointerException e) {}
        background.setIcon(new ImageIcon(starrySky));
        this.add(background);
        background.setSize(500, 400);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.validate();

    }
    public static void main(String[] args) {
        new App();
    }

}
