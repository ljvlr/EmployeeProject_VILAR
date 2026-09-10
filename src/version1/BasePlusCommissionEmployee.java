package version1;

public class BasePlusCommissionEmployee {

    private int empID;
    private String empName;
    private double totalSale;
    private  double baseSalary;

    BasePlusCommissionEmployee(){
        this.empID = 0;
        this.empName = "N/A";
        this.totalSale = 0;
        this.baseSalary = 0;
    }

    public BasePlusCommissionEmployee(int empID, String empName) {
        setEmpName(empName);
        setEmpID(empID);
        this.totalSale = 0;
        this.baseSalary = 0;
    }

    public BasePlusCommissionEmployee(int empID, String empName, double totalSale, double baseSalary) {
        setEmpName(empName);
        setEmpID(empID);
        setTotalSale(totalSale);
        setBaseSalary(baseSalary);
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

    public double computeSalary(){
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

    public void displayBasePlusCommissionEmployee() {
        System.out.println("name: " + empName);
        System.out.println("ID: " + empID);
        System.out.println("Total Sale: " + totalSale);
        System.out.println("Base Salary: " + baseSalary);
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

        return String.format("BasePlusCommissionEmployee [ID: %d, Name: %s, Total Sle: %.2f, Base Salary: %.2f, Commission Rate: %.0f%%, Total Salary: %.2f]", empID, empName, totalSale, baseSalary, commissionRate * 100, computeSalary());
    }









































}
