package version2;

public class BasePlusCommissionEmployee {

    private int empID;
    private Name empName;
    private double totalSale;
    private double baseSalary;
    private MyDate birthDate;
    private MyDate dateHired;

    public BasePlusCommissionEmployee() {
        this.empID = 0;
        this.empName = new Name();
        this.totalSale = 0;
        this.baseSalary = 0;
        this.birthDate = new MyDate();
        this.dateHired = new MyDate();
    }

    public BasePlusCommissionEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired) {
        setEmpID(empID);
        setEmpName(empName);
        setBirthDate(birthDate);
        setDateHired(dateHired);
        this.totalSale = 0;
        this.baseSalary = 0;
    }

    public BasePlusCommissionEmployee(int empID, Name empName, double totalSale, double baseSalary, MyDate birthDate, MyDate dateHired) {
        setEmpID(empID);
        setEmpName(empName);
        setTotalSale(totalSale);
        setBaseSalary(baseSalary);
        setBirthDate(birthDate);
        setDateHired(dateHired);
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

    public double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale < 0 ? 0 : totalSale;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary < 0 ? 0 : baseSalary;
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

    public double computeSalary() {
        double commissionRate = 0;

        if (totalSale < 50000) {
            commissionRate = 0.05;
        } else if (totalSale < 100000) {
            commissionRate = 0.10;
        } else if (totalSale < 500000) {
            commissionRate = 0.15;
        } else {
            commissionRate = 0.20;
        }

        return baseSalary + (totalSale * commissionRate);
    }

    public double computeSalary(int currentMonth){
        double salary = computeSalary();
        return (birthDate.getMonth() == currentMonth) ? salary + 5000 : salary;
    }

    public void displayBasePlusCommissionEmployee() {
        System.out.println("ID: " + empID);
        System.out.println("Name: " + empName);
        System.out.println("DOB: " + birthDate);
        System.out.println("Hired: " + dateHired);
        System.out.println("Total Sale: " + String.format("%.2f", totalSale));
        System.out.println("Base Salary: " + String.format("%.2f", baseSalary));
    }

    @Override
    public String toString() {
        double commissionRate = 0;

        if (totalSale < 50000) {
            commissionRate = 0.05;
        } else if (totalSale < 100000) {
            commissionRate = 0.10;
        } else if (totalSale < 500000) {
            commissionRate = 0.15;
        } else {
            commissionRate = 0.20;
        }

        return String.format("BasePlusCommissionEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Total Sale: %.2f, Base Salary: %.2f, Commission Rate: %.0f%%, Total Salary: %.2f]", empID, empName, birthDate, dateHired, totalSale, baseSalary, commissionRate * 100, computeSalary());
    }
}