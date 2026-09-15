package version2;

public class MyDate {
    private int day;
    private int month;
    private int year;

    MyDate(){
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public MyDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = (day < 1 || day > 31) ? 1 : day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = (month < 1 || month > 31) ? 1 : month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate(){
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        System.out.println(String.format("%02d %s %d", day, months[month - 1], year));
    }

    @Override
    public String toString() {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        return String.format("%02d %s %d", day, months[month - 1], year);
    }

}
