package version5;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee() {
        super();
        this.baseSalary = 0;
    }

    public BasePlusCommissionEmployee(int empID, Name empName,
                                      MyDate birthDate, MyDate dateHired,
                                      double totalSale, double baseSalary) {

        super(empID, empName, birthDate, dateHired, totalSale);

        setBaseSalary(baseSalary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary =
                baseSalary < 0 ? 0 : baseSalary;
    }

    @Override
    public double computeSalary(int currentMonth) {

        double salary =
                baseSalary
                        + (getTotalSale() * getCommissionRate());

        if (getBirthDate().getMonth() == currentMonth) {
            salary += 5000;
        }

        return salary;
    }

    public void displayBasePlusCommissionEmployee() {
        System.out.println("ID: " + getEmpID());
        System.out.println("Name: " + getEmpName());
        System.out.println("DOB: " + getBirthDate());
        System.out.println("Hired: " + getDateHired());
        System.out.println("Total Sale: "
                + String.format("%.2f", getTotalSale()));
        System.out.println("Base Salary: "
                + String.format("%.2f", baseSalary));
    }

    @Override
    public String toString() {
        return String.format(
                "BasePlusCommissionEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Total Sale: %.2f, Base Salary: %.2f]",
                getEmpID(), getEmpName(), getBirthDate(), getDateHired(),
                getTotalSale(), baseSalary);
    }
}