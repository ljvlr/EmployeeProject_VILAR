package version2;

public class PieceWorkerEmployee {
    private int empID;
    private Name empName;
    private int totalPiecesFinished;
    private double ratePerPiece;
    private MyDate birthDate;
    private MyDate dateHired;

    PieceWorkerEmployee(){
        this.empID = 0;
        this.empName = "N/A";
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0;
        this.birthDate = new MyDate();
        this.dateHired = new MyDate();
    }

    public PieceWorkerEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired) {
        setEmpID(empID);
        setEmpName(empName);
        setBirthDate(birthDate);
        setDateHired(dateHired);
        this.totalPiecesFinished= 0;
        this.ratePerPiece = 0;
    }

    public PieceWorkerEmployee(int empID, Name empName, int totalPiecesFinished, double ratePerPiece, MyDate birthDate, MyDate dateHired) {
        setEmpID(empID);
        setEmpName(empName);
        setBirthDate(birthDate);
        setDateHired(dateHired);
        setRatePerPiece(ratePerPiece);
        setTotalPiecesFinished(totalPiecesFinished);
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

    public String getEmpName() {
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

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished < 0 ? 0 : totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) { this.ratePerPiece = ratePerPiece < 0 ? 0 : ratePerPiece; }

    public double computeSalary(){
        double basePay = totalPiecesFinished * ratePerPiece;
        double bonusPay = Math.floor(totalPiecesFinished / 100) * (10 * ratePerPiece);
        return basePay + bonusPay;
    }

    public double computeSalary(int currentMonth){
        double salary = computeSalary();
        return (birthDate.getMonth() == currentMonth) ? salary + 5000 : salary;
    }

    public void displayPieceWorkerEmployee() {
        System.out.println("name: " + empName);
        System.out.println("ID: " + empID);
        System.out.println("DOB: " + birthDate);
        System.out.println("Hired: " + dateHired);
        System.out.println("Pieces Worked: " + totalPiecesFinished);
        System.out.println("Rate: " + ratePerPiece);
    }

    @Override
    public String toString() {
        return String.format("PieceWorkerEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Pieces: %d, Rate: %.2f, Total Salary: %.2f]", empID, empName, birthDate, dateHired, totalPiecesFinished, ratePerPiece, computeSalary());
    }

}
