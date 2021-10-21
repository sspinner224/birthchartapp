import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
import java.util.Scanner;
import java.sql.Time;

public class App {

    private BufferedImage starrySky;

    public App(){
        System.out.println("Welcome to our astrology calculator app.\n" +
                "If you would like to find out information about your birth chart, please provide the following" +
                "information in number format.\n(Ex. Jan = 1)\n" +
                "What is your birth month?");

        Scanner scanner = new Scanner(System.in);
        int birthMonth = scanner.nextInt();

        System.out.println("What is your birth day?");
        int birthDay = scanner.nextInt();

        System.out.println("What is your birth year?");
        int birthYear = scanner.nextInt();

//        System.out.println("What is your birth time?");
//        Time birthTime = Time.valueOf(scanner.next());

        AstrologyInfo astrologyInfo = new AstrologyInfo(birthMonth, birthDay, birthYear);
        astrologyInfo.getSunSign();

        System.out.println("Please enter your birth hour as a number. \n" +
                "For example: if you were born at 7pm, please enter 19.");
        int birthTime = scanner.nextInt();
        astrologyInfo.getMoonSign();

        /*
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
        */




    }
    public static void main(String[] args) {
        new App();
    }

}
