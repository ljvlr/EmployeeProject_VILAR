package version1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    public static void main(String[] args) {

        System.out.println("--- Hourly Employee Test ---");

        HourlyEmployee h1 = new HourlyEmployee(101, "Luem");
        h1.setTotalHoursWorked(45);
        h1.setRatePerHour(200);

        HourlyEmployee h2 = new HourlyEmployee(102, "Jay", 38, 200);

        System.out.println("[displayHourlyEmployee()]");
        h1.displayHourlyEmployee();
        h2.displayHourlyEmployee();

        System.out.println("[toString()]");
        System.out.println(h1);
        System.out.println(h2);


        System.out.println("--- Piece Worker Employee Test ---");

        PieceWorkerEmployee p1 = new PieceWorkerEmployee(201, "Lebron James");
        p1.setTotalPiecesFinished(250);
        p1.setRatePerPiece(15);

        PieceWorkerEmployee p2 = new PieceWorkerEmployee(202, "Sunshine", 150, 20);

        System.out.println("[displayPieceWorkerEmployee()]");
        p1.displayPieceWorkerEmployee();
        p2.displayPieceWorkerEmployee();

        System.out.println("[toString()]");
        System.out.println(p1);
        System.out.println(p2);


        System.out.println("--- Commission Employee Test ---");

        CommissionEmployee c1 = new CommissionEmployee(301, "Chris Brown");
        c1.setTotalSale(75000);

        CommissionEmployee c2 = new CommissionEmployee(302, "Shiro", 120000);

        System.out.println("[displayCommissionEmployee()]");
        c1.displayCommissionEmployee();
        c2.displayCommissionEmployee();

        System.out.println("[toString()]");
        System.out.println(c1);
        System.out.println(c2);


        System.out.println("--- Base Plus Commission Employee Test ---");

        BasePlusCommissionEmployee b1 = new BasePlusCommissionEmployee(401, "Base");
        b1.setTotalSale(60000);
        b1.setBaseSalary(20000);

        BasePlusCommissionEmployee b2 = new BasePlusCommissionEmployee(402, "Enteng", 150000, 25000);

        System.out.println("[displayBasePlusCommissionEmployee()]");
        b1.displayBasePlusCommissionEmployee();
        b2.displayBasePlusCommissionEmployee();

        System.out.println("[toString()]");
        System.out.println(b1);
        System.out.println(b2);
    }
}