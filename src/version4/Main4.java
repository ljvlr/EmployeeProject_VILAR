package version4;

public class Main4 {

    public static void main(String[] args) {

        System.out.println("======================================================================");
        System.out.println("EMPLOYEE ROSTER INITIALIZATION & ENROLLMENT");
        System.out.println("======================================================================");

        EmployeeRoster roster = new EmployeeRoster(6);

        Employee e1 = new HourlyEmployee(
                101,
                new Name("Alice", "M", "Smith"),
                new MyDate(18, 9, 2000),
                new MyDate(1, 6, 2022),
                45,
                200
        );

        Employee e2 = new PieceWorkerEmployee(
                201,
                new Name("Bob", "C", "Jones", "Jr."),
                new MyDate(5, 4, 1998),
                new MyDate(15, 1, 2023),
                250,
                15
        );

        Employee e3 = new CommissionEmployee(
                301,
                new Name("Maria", "L", "Reyes"),
                new MyDate(20, 9, 1999),
                new MyDate(10, 2, 2022),
                100000
        );

        Employee e4 = new BasePlusCommissionEmployee(
                401,
                new Name("Kevin", "S", "Tan"),
                new MyDate(8, 6, 2000),
                new MyDate(1, 1, 2022),
                100000,
                17000
        );

        Employee e5 = new HourlyEmployee(
                102,
                new Name("David", "A", "White"),
                new MyDate(15, 11, 2001),
                new MyDate(5, 7, 2023),
                40,
                200
        );

        Employee e6 = new CommissionEmployee(
                302,
                new Name("John", "P", "Garcia"),
                new MyDate(25, 3, 2002),
                new MyDate(8, 8, 2024),
                50000
        );

        System.out.println("Added: " + e1.getEmpName()
                + " (Hourly) -> "
                + roster.addEmployee(e1));

        System.out.println("Added: " + e2.getEmpName()
                + " (Piece Worker) -> "
                + roster.addEmployee(e2));

        System.out.println("Added: " + e3.getEmpName()
                + " (Commission) -> "
                + roster.addEmployee(e3));

        System.out.println("Added: " + e4.getEmpName()
                + " (Base Plus Commission) -> "
                + roster.addEmployee(e4));

        System.out.println("Added: " + e5.getEmpName()
                + " (Hourly) -> "
                + roster.addEmployee(e5));

        System.out.println("Added: " + e6.getEmpName()
                + " (Commission) -> "
                + roster.addEmployee(e6));

        Employee e7 = new HourlyEmployee(
                103,
                new Name("Extra", "D", "Employee"),
                new MyDate(1, 1, 2000),
                new MyDate(1, 1, 2024),
                40,
                100
        );

        System.out.println("Added: " + e7.getEmpName()
                + " (Hourly) -> "
                + roster.addEmployee(e7));

        System.out.println();
        System.out.println("--- ROSTER COMPOSITION COUNTS ---");
        System.out.println("Total Employees: 6 / 6");
        System.out.println("Hourly Employees: " + roster.countHE());
        System.out.println("Piece Worker Employees: " + roster.countPWE());
        System.out.println("Commission Employees (Pure): " + roster.countCE());
        System.out.println("Base Plus Commission Employees: " + roster.countBPCE());

        System.out.println();
        System.out.println("======================================================================");
        System.out.println("CATEGORICAL DISPLAY");
        System.out.println("======================================================================");

        System.out.println();
        System.out.println("--- Hourly Employees ---");
        roster.displayHE();

        System.out.println();
        System.out.println("--- Piece Worker Employees ---");
        roster.displayPWE();

        System.out.println();
        System.out.println("--- Commission Employees ---");
        roster.displayCE();

        System.out.println();
        System.out.println("--- Base Plus Commission Employees ---");
        roster.displayBPCE();

        System.out.println();
        System.out.println("======================================================================");
        System.out.println("ROSTER PAYROLL REPORT (Target Month: Sep)");
        System.out.println("======================================================================");

        roster.displayPayroll(9);

        System.out.println();
        System.out.println("======================================================================");
        System.out.println("ALL EMPLOYEES BEFORE REMOVAL");
        System.out.println("======================================================================");

        roster.displayAllEmployees();

        System.out.println();
        System.out.println("======================================================================");
        System.out.println("TESTING EMPLOYEE REMOVAL & ARRAY COMPACTION");
        System.out.println("======================================================================");

        Employee removed = roster.removeEmployee(201);

        if (removed != null) {
            System.out.println("Removing Employee ID 201 ("
                    + removed.getEmpName()
                    + ")... Successfully removed.");
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("Current Employee Count: 5");

        System.out.println();
        System.out.println("Remaining Employees in Roster:");

        roster.displayAllEmployees();
    }
}