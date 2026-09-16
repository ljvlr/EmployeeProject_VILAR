package version2;

public class CommissionEmployee {

    private int empID;
    private Name empName;
    private double totalSale;
    private MyDate birthDate;
    private MyDate dateHired;

    CommissionEmployee(){
        this.empID = 0;
        this.empName = new Name();
        this.totalSale = 0;
    }

    public CommissionEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired) {
        setEmpID(empID);
        setEmpName(empName);
        setBirthDate(birthDate);
        setDateHired(dateHired);
        this.totalSale = 0;
    }

    public CommissionEmployee(int empID, Name empName, double totalSale, MyDate birthDate, MyDate dateHired) {
        setEmpID(empID);
        setEmpName(empName);
        setBirthDate(birthDate);
        setDateHired(dateHired);
        setTotalSale(totalSale);
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

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
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

    public double computeSalary(int currentMonth){
        double salary = computeSalary();
        return (birthDate.getMonth() == currentMonth) ? salary + 5000 : salary;
    }

    public void displayCommissionEmployee() {
        System.out.println("ID: " + empID);
        System.out.println("Name: " + empName);
        System.out.println("DOB: " + birthDate);
        System.out.println("Hired: " + dateHired);
        System.out.println("Total Sale: " + String.format("%.2f", totalSale));
    }

    @Override
    public String toString() {
        return String.format("CommissionEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Total Sale: %.2f, Total Salary: %.2f]", empID, empName, birthDate, dateHired, totalSale, computeSalary());
    }
































































}
