package nomeri4;

public class DailyWageWorkers extends Employee{
    private int days ;
    private double dailyWage ;

    public DailyWageWorkers(String firstName, String lastName, String mobileNumber, double dailyWage, int days) {
        super(firstName, lastName, mobileNumber);
        this.dailyWage = dailyWage;
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(double dailyWage) {
        this.dailyWage = dailyWage;
    }

    @Override
    public double Salary(){
        return days*dailyWage;
    }
}
