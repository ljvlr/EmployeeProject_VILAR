package version3;

public class HourlyEmployee extends Employee {

    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
        super();
        this.totalHoursWorked = 0;
        this.ratePerHour = 0;
    }

    public HourlyEmployee(int empID, Name empName, MyDate birthDate,
                          MyDate dateHired, float totalHoursWorked, double ratePerHour) {

        super(empID, empName, birthDate, dateHired);

        setTotalHoursWorked(totalHoursWorked);
        setRatePerHour(ratePerHour);
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

    @Override
    public double computeSalary() {
        double regularSal = 40 * ratePerHour;
        double overTimeSal = (ratePerHour * 1.5) * (totalHoursWorked - 40);

        if (totalHoursWorked <= 40) {
            return totalHoursWorked * ratePerHour;
        } else {
            return regularSal + overTimeSal;
        }
    }

    @Override
    public double computeSalary(int currentMonth) {
        double salary = computeSalary();

        return salary + super.computeSalary(currentMonth);
    }

    public void displayHourlyEmployee() {
        super.displayEmployee();
        System.out.println("Hours: " + String.format("%.2f", totalHoursWorked));
        System.out.println("Rate: " + String.format("%.2f", ratePerHour));
    }

    @Override
    public String toString() {
        return String.format(
                "HourlyEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Hours: %.2f, Rate: %.2f, Total Salary: %.2f]",
                getEmpID(), getEmpName(), getBirthDate(), getDateHired(),
                totalHoursWorked, ratePerHour, computeSalary());
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        HourlyEmployee other = (HourlyEmployee) obj;

        return Float.compare(totalHoursWorked, other.totalHoursWorked) == 0
                && Double.compare(ratePerHour, other.ratePerHour) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Float.hashCode(totalHoursWorked);
        result = 31 * result + Double.hashCode(ratePerHour);
        return result;
    }

    @Override
    public HourlyEmployee clone() {
        return (HourlyEmployee) super.clone();
    }
}