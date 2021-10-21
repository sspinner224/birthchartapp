import java.sql.Time;

public class AstrologyInfo {

    private int birthMonth, birthDay, birthYear;
    private int birthTime;
    private int defaultMoonDay, defaultMoonMonth, defaultMoonYear;


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

    public AstrologyInfo(int birthMonth, int birthDay, int birthYear) {
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.birthTime = birthTime;
        defaultMoonDay = 23;
        defaultMoonMonth = 1;
        defaultMoonYear = 1921;
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

        int totalDays = 0;
        int dayDifference = 0;
        int yearDifference = (birthYear - defaultMoonYear)*365;
        int monthDifference = (birthMonth - defaultMoonMonth)*30;
        if (birthDay < defaultMoonDay && birthMonth == defaultMoonMonth){
            dayDifference = (birthDay - defaultMoonDay) ;
            System.out.println(dayDifference);
        }
        if (birthDay < defaultMoonDay ){
            dayDifference = (birthDay - defaultMoonDay) + monthDifference - (30-birthDay);
            System.out.println("test");
        }
        if (birthDay > defaultMoonDay){
            dayDifference = (birthDay - defaultMoonDay) - (30-birthDay);
        }

        totalDays += yearDifference;
        System.out.println(totalDays);
        totalDays += monthDifference;
        System.out.println(totalDays);
        totalDays = totalDays - dayDifference;
        System.out.println(totalDays);
        //double birthTimeValue = birthTime/24;
       // totalDays += birthTimeValue;

        System.out.println(totalDays);

    }



}
