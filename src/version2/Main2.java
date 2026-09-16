package version2;

public class Main2 {

    public static void main(String[] args) {

        System.out.println("--- Name & Date Output Verification ---");

        Name name = new Name("Alice", "M", "Smith");
        MyDate date = new MyDate(18, 9, 2026);

        System.out.print("Name: ");
        name.displayName();

        System.out.print("Date: ");
        date.displayDate();


        System.out.println();
        System.out.println("--- Hourly Employee Payroll Test ---");

        Name name1 = new Name("Alice", "M", "Smith");
        MyDate birth1 = new MyDate(18, 9, 2000);
        MyDate hired1 = new MyDate(1, 6, 2022);

        HourlyEmployee h1 = new HourlyEmployee(101, name1, birth1, hired1);
        h1.setTotalHoursWorked(45);
        h1.setRatePerHour(200);

        Name name2 = new Name("John", "D", "Doe");
        MyDate birth2 = new MyDate(10, 5, 2001);
        MyDate hired2 = new MyDate(5, 7, 2023);

        HourlyEmployee h2 = new HourlyEmployee(
                102, name2, 38, 200, birth2, hired2
        );

        System.out.println("[displayHourlyEmployee()]");
        h1.displayHourlyEmployee();
        h2.displayHourlyEmployee();

        System.out.println();
        System.out.println("[toString()]");
        System.out.println(h1);
        System.out.println(h2);

        System.out.println();
        System.out.println("[Birthday Incentive Check]");
        System.out.println("Regular Month (Oct) Salary: "
                + String.format("%.2f", h1.computeSalary(10)));
        System.out.println("Birth Month (Sep) Salary: "
                + String.format("%.2f", h1.computeSalary(9)));


        System.out.println();
        System.out.println("--- Piece Worker Employee Payroll Test ---");

        Name name3 = new Name("Bob", "C", "Jones");
        MyDate birth3 = new MyDate(15, 8, 2000);
        MyDate hired3 = new MyDate(2, 3, 2022);

        PieceWorkerEmployee p1 = new PieceWorkerEmployee(
                201, name3, birth3, hired3
        );
        p1.setTotalPiecesFinished(250);
        p1.setRatePerPiece(15);

        Name name4 = new Name("Jane", "L", "Doe");
        MyDate birth4 = new MyDate(20, 4, 2001);
        MyDate hired4 = new MyDate(4, 5, 2023);

        PieceWorkerEmployee p2 = new PieceWorkerEmployee(
                202, name4, 150, 20, birth4, hired4
        );

        System.out.println("[displayPieceWorkerEmployee()]");
        p1.displayPieceWorkerEmployee();
        p2.displayPieceWorkerEmployee();

        System.out.println();
        System.out.println("[toString()]");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println();
        System.out.println("[Birthday Incentive Check]");
        System.out.println("Regular Month (Oct) Salary: "
                + String.format("%.2f", p1.computeSalary(10)));
        System.out.println("Birth Month (Aug) Salary: "
                + String.format("%.2f", p1.computeSalary(8)));


        System.out.println();
        System.out.println("--- Commission Employee Payroll Test ---");

        Name name5 = new Name("Charlie", "B", "Brown");
        MyDate birth5 = new MyDate(12, 7, 2000);
        MyDate hired5 = new MyDate(10, 2, 2022);

        CommissionEmployee c1 = new CommissionEmployee(
                301, name5, birth5, hired5
        );
        c1.setTotalSale(75000);

        Name name6 = new Name("Sarah", "A", "Smith");
        MyDate birth6 = new MyDate(25, 11, 2001);
        MyDate hired6 = new MyDate(8, 6, 2023);

        CommissionEmployee c2 = new CommissionEmployee(
                302, name6, 120000, birth6, hired6
        );

        System.out.println("[displayCommissionEmployee()]");
        c1.displayCommissionEmployee();
        c2.displayCommissionEmployee();

        System.out.println();
        System.out.println("[toString()]");
        System.out.println(c1);
        System.out.println(c2);

        System.out.println();
        System.out.println("[Birthday Incentive Check]");
        System.out.println("Regular Month (Oct) Salary: "
                + String.format("%.2f", c1.computeSalary(10)));
        System.out.println("Birth Month (Jul) Salary: "
                + String.format("%.2f", c1.computeSalary(7)));


        System.out.println();
        System.out.println("--- Base Plus Commission Employee Payroll Test ---");

        Name name7 = new Name("David", "L", "Lee");
        MyDate birth7 = new MyDate(8, 6, 2000);
        MyDate hired7 = new MyDate(1, 1, 2022);

        BasePlusCommissionEmployee b1 = new BasePlusCommissionEmployee(
                401, name7, birth7, hired7
        );
        b1.setTotalSale(60000);
        b1.setBaseSalary(20000);

        Name name8 = new Name("Emily", "R", "Garcia");
        MyDate birth8 = new MyDate(22, 12, 2001);
        MyDate hired8 = new MyDate(3, 8, 2023);

        BasePlusCommissionEmployee b2 = new BasePlusCommissionEmployee(
                402, name8, 150000, 25000, birth8, hired8
        );

        System.out.println("[displayBasePlusCommissionEmployee()]");
        b1.displayBasePlusCommissionEmployee();
        b2.displayBasePlusCommissionEmployee();

        System.out.println();
        System.out.println("[toString()]");
        System.out.println(b1);
        System.out.println(b2);

        System.out.println();
        System.out.println("[Birthday Incentive Check]");
        System.out.println("Regular Month (Oct) Salary: "
                + String.format("%.2f", b1.computeSalary(10)));
        System.out.println("Birth Month (Jun) Salary: "
                + String.format("%.2f", b1.computeSalary(6)));
    }
}