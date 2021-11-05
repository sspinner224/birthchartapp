import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrawingPanel extends JPanel{
	
	//private String[] dayBox = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	 
	
	int count = 1;
	private int birthMonth, birthDay, birthYear, birthHour;
	
	
	
	
	
	public DrawingPanel() {
		

        super();
        this.setBackground(java.awt.Color.white);
        this.setPreferredSize(new java.awt.Dimension(500, 500));
        this.setSize(new java.awt.Dimension(500, 500));
        
       
       

        
        GridLayout gridLayout = new GridLayout(4,2);
        
        JLabel monthLabel = new JLabel("Birth Month:");
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
				
			}
        	
        });
        
        dayBox.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				birthDay = (int) dayBox.getSelectedItem();
				
			}
        	
        });
        
        yearBox.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				birthYear = (int) yearBox.getSelectedItem();
				
			}
        	
        });
        
        hourBox.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				birthHour = (int) hourBox.getSelectedItem();
				
				AstrologyInfo astrologyInfo = new AstrologyInfo(birthMonth, birthDay, birthYear, birthHour);
		        astrologyInfo.getSunSign();

		        
		        astrologyInfo.getMoonSign();
				
			}
        	
        });
      
      
        
        this.add(monthLabel);
        this.add(monthBox);
        this.add(dayLabel);
        this.add(dayBox);
        this.add(yearLabel);
        this.add(yearBox);
        this.add(hourLabel);
        this.add(hourBox);
	}

}
