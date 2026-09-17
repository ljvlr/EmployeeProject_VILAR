package version4;

public class CommissionEmployee extends Employee {

    private double totalSale;

    public CommissionEmployee() {
        super();
        this.totalSale = 0;
    }

    public CommissionEmployee(int empID, Name empName, MyDate birthDate,
                              MyDate dateHired, double totalSale) {

        super(empID, empName, birthDate, dateHired);

        setTotalSale(totalSale);
    }

    public double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale < 0 ? 0 : totalSale;
    }

    public double getCommissionRate() {
        if (totalSale < 50000) {
            return 0.05;
        } else if (totalSale < 100000) {
            return 0.10;
        } else if (totalSale < 500000) {
            return 0.15;
        } else {
            return 0.20;
        }
    }

    @Override
    public double computeSalary() {
        return totalSale * getCommissionRate();
    }

    @Override
    public double computeSalary(int currentMonth) {
        double salary = computeSalary();

        return salary + super.computeSalary(currentMonth);
    }

    public void displayCommissionEmployee() {
        super.displayEmployee();
        System.out.println("Total Sale: "
                + String.format("%.2f", totalSale));
        System.out.println("Commission Rate: "
                + String.format("%.0f%%", getCommissionRate() * 100));
    }

    @Override
    public String toString() {
        return String.format(
                "CommissionEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Total Sale: %.2f, Commission Rate: %.0f%%, Total Salary: %.2f]",
                getEmpID(), getEmpName(), getBirthDate(), getDateHired(),
                totalSale, getCommissionRate() * 100, computeSalary());
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        CommissionEmployee other = (CommissionEmployee) obj;

        return Double.compare(totalSale, other.totalSale) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(totalSale);
        return result;
    }

    @Override
    public CommissionEmployee clone() {
        return (CommissionEmployee) super.clone();
    }
}