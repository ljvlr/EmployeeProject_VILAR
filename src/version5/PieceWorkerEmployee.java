package version5;

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
        this.ratePerPiece =
                ratePerPiece < 0 ? 0 : ratePerPiece;
    }

    public double computeSalary(int currentMonth) {

        double basePay =
                totalPiecesFinished * ratePerPiece;

        double bonusPay =
                Math.floor(totalPiecesFinished / 100.0)
                        * (10 * ratePerPiece);

        double salary = basePay + bonusPay;

        if (getBirthDate().getMonth() == currentMonth) {
            salary += 5000;
        }

        return salary;
    }

    public void displayPieceWorkerEmployee() {
        System.out.println("ID: " + getEmpID());
        System.out.println("Name: " + getEmpName());
        System.out.println("DOB: " + getBirthDate());
        System.out.println("Hired: " + getDateHired());
        System.out.println("Pieces: " + totalPiecesFinished);
        System.out.println("Rate: " + String.format("%.2f", ratePerPiece));
    }

    @Override
    public String toString() {
        return String.format(
                "PieceWorkerEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Pieces: %d, Rate: %.2f]",
                getEmpID(), getEmpName(), getBirthDate(), getDateHired(),
                totalPiecesFinished, ratePerPiece);
    }
}