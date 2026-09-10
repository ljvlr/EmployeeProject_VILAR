package version1;

public class HourlyEmployee {

    private int empID;
    private String empName;
    private float totalHoursWorked;
    private double ratePerHour;

    HourlyEmployee(){
        this.empID = 0;
        this.empName = "N/A";
        this.totalHoursWorked = 0;
        this.ratePerHour = 0;
    }

    public HourlyEmployee(int empID, String empName) {
        setEmpID(empID);
        setEmpName(empName);
        this.totalHoursWorked = 0;
        this.ratePerHour = 0;
    }

    public HourlyEmployee(int empID, String empName, float totalHoursWorked, double ratePerHour) {
        setEmpID(empID);
        setEmpName(empName);
        setRatePerHour(ratePerHour);
        setTotalHoursWorked(totalHoursWorked);
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
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

    public void displayHourlyEmployee() {
        System.out.println("name: " + empName);
        System.out.println("ID: " + empID);
        System.out.println("Hours Worked: " + totalHoursWorked);
        System.out.println("Rate: " + ratePerHour);
    }

    @Override
    public String toString() {
        return String.format("HourlyEmployee [ID: %d, Name: %s, Hours: %.2f, Rate: %.2f, Total Salary: %.2f]", empID, empName, totalHoursWorked, ratePerHour, computeSalary());
    }
}
