package version2;

public class HourlyEmployee {

    private int empID;
    private Name empName;
    private float totalHoursWorked;
    private double ratePerHour;
    private MyDate birthDate;
    private MyDate dateHired;

    HourlyEmployee(){
        this.empID = 0;
        this.empName = new Name();
        this.totalHoursWorked = 0;
        this.ratePerHour = 0;
        this.birthDate = new MyDate();
        this.dateHired = new MyDate();
    }

    public HourlyEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired) {
        setEmpID(empID);
        setEmpName(empName);
        setBirthDate(birthDate);
        setDateHired(dateHired);
        this.totalHoursWorked = 0;
        this.ratePerHour = 0;
    }

    public HourlyEmployee(int empID, Name empName, float totalHoursWorked, double ratePerHour, MyDate birthDate, MyDate dateHired) {
        setEmpID(empID);
        setEmpName(empName);
        setBirthDate(birthDate);
        setDateHired(dateHired);
        setRatePerHour(ratePerHour);
        setTotalHoursWorked(totalHoursWorked);
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(MyDate birthDate) {
        this.birthDate = birthDate;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked < 0 ? 0 : totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour < 0 ? 0 : ratePerHour;
    }

    public double computeSalary(){
        double regularSal = 40 * ratePerHour;
        double overTimeSal = (ratePerHour * 1.5) * (totalHoursWorked - 40);
        if(this.totalHoursWorked <= 40){
            return totalHoursWorked * ratePerHour;
        }else{
            return overTimeSal + regularSal;
        }
    }

    public double computeSalary(int currentMonth){
        double salary = computeSalary();
        return (birthDate.getMonth() == currentMonth) ? salary + 5000 : salary;
    }

    public void displayHourlyEmployee() {
        System.out.println("ID: " + empID);
        System.out.println("name: " + empName);
        System.out.println("DOB: " + birthDate);
        System.out.println("Hired: " + dateHired);
        System.out.println("Hours Worked: " + totalHoursWorked);
        System.out.println("Rate: " + ratePerHour);

    }

    @Override
    public String toString() {
        return String.format("HourlyEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Hours: %.2f, Rate: %.2f, Total Salary: %.2f]", empID, empName, birthDate,dateHired, totalHoursWorked, ratePerHour, computeSalary());
    }
}
