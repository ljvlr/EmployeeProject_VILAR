package version1;

public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private int totalPiecesFinished;
    private double ratePerPiece;

    PieceWorkerEmployee(){
        this.empID = 0;
        this.empName = "N/A";
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0;
    }

    public PieceWorkerEmployee(int empID, String empName) {
        setEmpID(empID);
        setEmpName(empName);
        this.totalPiecesFinished= 0;
        this.ratePerPiece = 0;
    }

    public PieceWorkerEmployee(int empID, String empName, int totalPiecesFinished, double ratePerPiece) {
        setEmpID(empID);
        setEmpName(empName);
        setRatePerPiece(ratePerPiece);
        setTotalPiecesFinished(totalPiecesFinished);
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

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public double computeSalary(){
        double basePay = totalPiecesFinished * ratePerPiece;
        double bonusPay = Math.floor(totalPiecesFinished / 100) * (10 * ratePerPiece);
        return basePay + bonusPay;
    }

    public void displayPieceWorkerEmployee(){
        System.out.println("name: " + empName);
        System.out.println("ID: " + empID);
        System.out.println("Pieces Worked: " + totalPiecesFinished);
        System.out.println("Rate: " + ratePerPiece);
    }

    @Override
    public String toString() {
        return String.format("Name: %s\n ID: %d\n Pieces Worked: %d\n Rate: %f'\n Total Salary: %f\n", empName, empID, totalPiecesFinished, ratePerPiece, computeSalary());
    }

}
