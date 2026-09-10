package version1;

public class CommissionEmployee {

    private int empID;
    private String empName;
    private double totalSale;


    CommissionEmployee(){
        this.empID = 0;
        this.empName = "N/A";
        this.totalSale = 0;
    }

    public CommissionEmployee(int empID, String empName) {
        setEmpID(empID);
        setEmpName(empName);
        this.totalSale = 0;
    }

    public CommissionEmployee(int empID, String empName, double totalSale) {
        setEmpID(empID);
        setEmpName(empName);
        setTotalSale(totalSale);
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale < 0 ? 0 : totalSale;
    }


    public double computeSalary(){
        if(totalSale < 50000){
            return totalSale * 0.05;
        }else if(totalSale < 100000){
            return totalSale * 0.10;
        }else if(totalSale < 500000){
            return totalSale * 0.15;
        }else{
            return totalSale * 0.20;
        }
    }

    public void displayCommissionEmployee() {
        System.out.println("name: " + empName);
        System.out.println("ID: " + empID);
        System.out.println("Total Sale: " + totalSale);
    }

    @Override
    public String toString() {
        return String.format("CommissionEmployee [ID: %d, Name: %s, Total Sle: %.2f, Total Salary: %.2f]", empID, empName, totalSale, computeSalary());
    }
































































}
