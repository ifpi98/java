package test03;

public class BirthDay {
    private int day;
    private int month;
    private int year;
    private boolean isValid;

    public BirthDay(){
        day = 1;
        month = 1;
        year = 2000;
        isValid = true;
    }

//    public BirthDay(int day1, int month1, int year1, boolean isValid1){
//        day = day1;
//        month = month1;
//        year = year1;
//        isValid = isValid1;
//    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day<1 || day>12){
            isValid=false;
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month<1 || month>12){
            isValid=false;
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<0 || year>3000){
            isValid=false;
        }
        this.year = year;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public void printDay() {
        if(isValid == false){
            System.out.println("유효하지 않은 날짜입니다.");
            return;
        }
        System.out.println(year + " - " +  month + " - " + day);
//        System.out.println(this.getDay() + " - " +  this.getMonth() + " - " + this.getYear());
    }
}
