import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.border.EtchedBorder;

public class DrawingPanel extends JPanel{
	
	//private String[] dayBox = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	 
	
	int count = 1;
	private int birthMonth;
    private int birthDay;
    private int birthYear;
    private int birthHour;

    public String getBirthMinute() {
        return birthMinute;
    }

    public void setBirthMinute(String birthMinute) {
        this.birthMinute = birthMinute;
    }

    private String birthMinute;
	private String birthLocation;
	private String nameValue;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthHour() {
        return birthHour;
    }

    public void setBirthHour(int birthHour) {
        this.birthHour = birthHour;
    }

    public String getNameValue() {
        return nameValue;
    }

    public void setNameValue(String nameValue) {
        this.nameValue = nameValue;
    }

    public DrawingPanel(String nameValue) {

        super(new BorderLayout());
      //  JScrollPane scrollBar=new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.setBackground(Color.white);
//        this.setBorder(BorderFactory.createRaisedBevelBorder());
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        this.setSize(screenSize.width, screenSize.height);
        this.setSize(420,420);
        this.nameValue = nameValue;
        this.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        JLabel welcomeLabel = new JLabel("Hello, " + nameValue + "!" + " Enter your information below:");
        JLabel instructions = new JLabel("If your birth hour is 7pm, use 19 as birth hour.");
        this.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        this.add(welcomeLabel, BorderLayout.NORTH);
        this.add(instructions);

        JPanel infoPanel = new JPanel(new GridLayout(4,2));
        //GridLayout gridLayout = new GridLayout(4,2);
        
        JLabel monthLabel = new JLabel("Birth Month:");
     //   monthLabel.insets = new Insets(0, 0, 0, 0);
        JComboBox<Integer> monthBox = new JComboBox<Integer>();
        
        for (int i = 1; i <= 12; i++) {
        	  monthBox.addItem(i);
        }

        JLabel dayLabel = new JLabel("Birth Day:");
        JComboBox<Integer> dayBox = new JComboBox<Integer>();
        
        for (int i = 1; i <= 31; i++) {
        	  dayBox.addItem(i);
        }
        JLabel yearLabel = new JLabel("Birth Year:");
        JComboBox<Integer> yearBox = new JComboBox<Integer>();

        for (int i = 1930; i <= 2021; i++) {
      	  yearBox.addItem(i);
      }
        
        JLabel hourLabel = new JLabel("Birth Hour:");
        JComboBox<Integer> hourBox = new JComboBox<Integer>();
        
        for (int i = 1; i <= 24; i++) {
        	  hourBox.addItem(i);
        }
        
        monthBox.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				birthMonth = (int) monthBox.getSelectedItem();
				//System.out.println(birthMonth);
			}
        	
        });
        
        dayBox.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				birthDay = (int) dayBox.getSelectedItem();
				//System.out.println(birthDay);
				
			}
        	
        });
        
        yearBox.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				birthYear = (int) yearBox.getSelectedItem();

				//System.out.println(birthYear);
			}
        	
        });
        
        hourBox.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				birthHour = (int) hourBox.getSelectedItem();

			}
        	
        });

        JButton submitButton = new JButton("Submit");
              submitButton.addActionListener(new ActionListener() {
			        @Override
			        public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				      AstrologyInfo astrologyInfo = new AstrologyInfo(nameValue, birthMonth, birthDay, birthYear, birthHour, birthMinute, birthLocation);
				      CafeAstrologyUtility utility = new CafeAstrologyUtility();
				      CafeAstrologyData cafeAstrologyData = utility.getInfo(astrologyInfo);
                        System.out.println("In here");
		            //  astrologyInfo.getSunSign();
		              if(e.getSource() == submitButton) {
		                  System.out.println("In here");
		            	  NewWindow newWindow = new NewWindow();
		              }

		              //astrologyInfo.getMoonSign();
			}
        	
        });
        

        
        infoPanel.add(monthLabel);
        infoPanel.add(monthBox);
        infoPanel.add(dayLabel);
        infoPanel.add(dayBox);
        infoPanel.add(yearLabel);
        infoPanel.add(yearBox);
        infoPanel.add(hourLabel);
        infoPanel.add(hourBox);
     //   infoPanel.add(submitButton);

        this.add(infoPanel, BorderLayout.CENTER);
        this.add(submitButton, BorderLayout.SOUTH);
	}

}
