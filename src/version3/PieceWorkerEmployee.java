package version3;

public class PieceWorkerEmployee extends Employee {

    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
        super();
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0;
    }

    public PieceWorkerEmployee(int empID, Name empName, MyDate birthDate,
                               MyDate dateHired, int totalPiecesFinished, double ratePerPiece) {

        super(empID, empName, birthDate, dateHired);

        setTotalPiecesFinished(totalPiecesFinished);
        setRatePerPiece(ratePerPiece);
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished =
                totalPiecesFinished < 0 ? 0 : totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece < 0 ? 0 : ratePerPiece;
    }

    @Override
    public double computeSalary() {
        double basePay = totalPiecesFinished * ratePerPiece;
        double bonusPay =
                Math.floor(totalPiecesFinished / 100.0)
                        * (10 * ratePerPiece);

        return basePay + bonusPay;
    }

    @Override
    public double computeSalary(int currentMonth) {
        double salary = computeSalary();

        return salary + super.computeSalary(currentMonth);
    }

    public void displayPieceWorkerEmployee() {
        super.displayEmployee();
        System.out.println("Pieces: " + totalPiecesFinished);
        System.out.println("Rate: " + String.format("%.2f", ratePerPiece));
    }

    @Override
    public String toString() {
        return String.format(
                "PieceWorkerEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Pieces: %d, Rate: %.2f, Total Salary: %.2f]",
                getEmpID(), getEmpName(), getBirthDate(), getDateHired(),
                totalPiecesFinished, ratePerPiece, computeSalary());
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        PieceWorkerEmployee other = (PieceWorkerEmployee) obj;

        return totalPiecesFinished == other.totalPiecesFinished
                && Double.compare(ratePerPiece, other.ratePerPiece) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Integer.hashCode(totalPiecesFinished);
        result = 31 * result + Double.hashCode(ratePerPiece);
        return result;
    }

    @Override
    public PieceWorkerEmployee clone() {
        return (PieceWorkerEmployee) super.clone();
    }
}