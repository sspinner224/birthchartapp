import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class AstrologyInfo {

    private int birthMonth, birthDay, birthYear;
    private int defaultMoonDay, defaultMoonMonth, defaultMoonYear;
    private int birthTime;
    private LocalDate date;
    private LocalDate defaultDate;
    private DateHandler dateHandler;
    
    
    
    


	public AstrologyInfo(int birthMonth, int birthDay, int birthYear, int birthTime) {
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.birthTime = birthTime;
        defaultMoonDay = 23;
        defaultMoonMonth = 1;
        defaultMoonYear = 1921;
        date = LocalDate.of(birthYear,birthMonth,birthDay);
        defaultDate = LocalDate.of(1921, 1, 23);
        dateHandler = new DateHandler(date,defaultDate);

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

    public int getBirthTime() { return birthTime; }

    public void setBirthTime(int birthTime) {
        this.birthTime = birthTime;
    }
    

    public int getDefaultMoonDay() {
		return defaultMoonDay;
	}



	public void setDefaultMoonDay(int defaultMoonDay) {
		this.defaultMoonDay = defaultMoonDay;
	}



	public int getDefaultMoonMonth() {
		return defaultMoonMonth;
	}



	public void setDefaultMoonMonth(int defaultMoonMonth) {
		this.defaultMoonMonth = defaultMoonMonth;
	}



	public int getDefaultMoonYear() {
		return defaultMoonYear;
	}



	public void setDefaultMoonYear(int defaultMoonYear) {
		this.defaultMoonYear = defaultMoonYear;
	}


   

    public void getSunSign() {
        if ((birthMonth == 3 && birthDay >= 21) || (birthMonth == 4 && birthDay <= 19)) {

            System.out.println("You're an Aries");

        }

        else if ((birthMonth == 4 && birthDay >= 20) || (birthMonth == 5 && birthDay <= 20)) {

            System.out.println("You're a Taurus");

        }

        else if ((birthMonth == 5 && birthDay >= 21) || (birthMonth == 6 && birthDay <= 20)) {

            System.out.println("You're a Gemini");

        }

        else if ((birthMonth == 6 && birthDay >= 21) || (birthMonth == 7 && birthDay <= 22)) {

            System.out.println("You're a Cancer");

        }

        else if ((birthMonth == 7 && birthDay >= 23) || (birthMonth == 8 && birthDay <= 22)) {

            System.out.println("You're a Leo");

        }

        else if ((birthMonth == 8 && birthDay >= 23) || (birthMonth == 9 && birthDay <= 22)) {

            System.out.println("You're a Virgo");

        }

        else if ((birthMonth == 9 && birthDay >= 23) || (birthMonth == 10 && birthDay <= 22)) {

            System.out.println("You're a Libra");

        }

        else if ((birthMonth == 10 && birthDay >= 23) || (birthMonth == 11 && birthDay <= 21)) {

            System.out.println("You're a Scorpio");

        }

        else if ((birthMonth == 11 && birthDay >= 22) || (birthMonth == 12 && birthDay <= 21)) {

            System.out.println("You're a Sagittarius");

        }

        else if ((birthMonth == 12 && birthDay >= 22) || (birthMonth == 1 && birthDay <= 20)) {

            System.out.println("You're a Capricorn");

        }

        else if ((birthMonth == 1 && birthDay >= 21) || (birthMonth == 2 && birthDay <= 18)) {

            System.out.println("You're an Aquarius");

        }

        else if ((birthMonth == 2 && birthDay >= 19) || (birthMonth == 3 && birthDay <= 20)) {

            System.out.println("You're a Pisces");

        }

    }

    public void getMoonSign(){

     float dayDifference = dateHandler.getDaysDifference();
     float hourValue = (((float)birthTime)/ ((float)24));
     System.out.println(hourValue);
     dayDifference += hourValue;
     System.out.println(dayDifference);
     float moonValue = (float) ((float) (13.176*dayDifference) + 12.0947 * 
    		 Math.cos(0.11403 * dayDifference) * 
    		 Math.sin(0.11403 *(dayDifference + 1)) - 6.627);
     
     System.out.println(moonValue);
     float moonValue2 = moonValue/ (float) 360;
     System.out.println(moonValue2);
     int moonValue3 = (int) (moonValue/360);
     System.out.println(moonValue3);
     float moonValueDiff = moonValue2-moonValue3;
     System.out.println(moonValueDiff);
     
     float finalValue = moonValueDiff* (float) 360;
     System.out.println(finalValue);
     
    if (finalValue == 0 || finalValue < 29.999) {
    	System.out.println("Your moon sign is Leo!");
    }
    else if (finalValue == 30 || finalValue < 59.999) {
    	System.out.println("Your moon sign is Virgo!");
    }
    else if (finalValue == 60 || finalValue < 89.999) {
    	System.out.println("Your moon sign is Libra!");
    }
    else if (finalValue == 90 || finalValue < 119.999) {
    	System.out.println("Your moon sign is Scorpio!");
    }
    else if (finalValue == 120 || finalValue < 149.999) {
    	System.out.println("Your moon sign is Sagittarius!");
    }
    else if (finalValue == 150 || finalValue < 179.999) {
    	System.out.println("Your moon sign is Capricorn!");
    }
    else if (finalValue == 180 || finalValue < 209.999) {
    	System.out.println("Your moon sign is Aquarius!");
    }
    else if (finalValue == 210 || finalValue < 239.999) {
    	System.out.println("Your moon sign is Pisces!");
    }
    else if (finalValue == 240 || finalValue < 269.999) {
    	System.out.println("Your moon sign is Aries!");
    }
    else if (finalValue == 270 || finalValue < 299.999) {
    	System.out.println("Your moon sign is Taurus!");
    }
    else if (finalValue == 300 || finalValue < 329.999) {
    	System.out.println("Your moon sign is Gemini!");
    }
    else if (finalValue == 330 || finalValue < 359.999) {
    	System.out.println("Your moon sign is Cancer!");
    }
     
     











//        int totalDays = 0;
//        int dayDifference = 0;
//        int yearDifference = (birthYear - defaultMoonYear)*365;
//        int monthDifference = (birthMonth - defaultMoonMonth)*30;
//        if (birthDay < defaultMoonDay && birthMonth == defaultMoonMonth){
//            dayDifference = (birthDay - defaultMoonDay) ;
//            System.out.println(dayDifference);
//        }
//        if (birthDay < defaultMoonDay ){
//            dayDifference = (birthDay - defaultMoonDay) + monthDifference - (30-birthDay);
//            System.out.println("test");
//        }
//        if (birthDay > defaultMoonDay){
//            dayDifference = (birthDay - defaultMoonDay) - (30-birthDay);
//        }
//
//        totalDays += yearDifference;
//        System.out.println(totalDays);
//        totalDays += monthDifference;
//        System.out.println(totalDays);
//        totalDays = totalDays - dayDifference;
//        System.out.println(totalDays);
//        //double birthTimeValue = birthTime/24;
//       // totalDays += birthTimeValue;
//
//        System.out.println(totalDays);

    }



}
