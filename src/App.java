 
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
import java.util.Scanner;
import java.sql.Time;


//import javafx.application.Application;

public class App extends Application{

	
	 
	 @Override
		public void start(Stage primaryStage) throws Exception {
			// TODO Auto-generated method stub
		 
		 BorderPane root = new BorderPane();
		 Scene scene = new Scene(root,400,400);
		 scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		 primaryStage.setScene(scene);
		 primaryStage.show();
			
		}
    

    public App() {
    	
    	
    	/*
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
        
        System.out.println("Please enter your birth hour as a number. \n" +
                "For example: if you were born at 7pm, please enter 19.");
        int birthTime = scanner.nextInt();

        AstrologyInfo astrologyInfo = new AstrologyInfo(birthMonth, birthDay, birthYear, birthTime);
        astrologyInfo.getSunSign();

        
        astrologyInfo.getMoonSign();
        
        */

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
       launch(args);
    }
	


}
