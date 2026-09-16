package version3;

public class Main3 {

    public static void main(String[] args) {

        Name name = new Name("Alice", "M", "Smith");
        MyDate birthDate = new MyDate(18, 9, 2000);
        MyDate dateHired = new MyDate(1, 6, 2022);

        Employee[] employees = {
                new HourlyEmployee(
                        101,
                        name,
                        birthDate,
                        dateHired,
                        45,
                        200
                ),
                new PieceWorkerEmployee(
                        201,
                        new Name("Bob", "C", "Jones", "Jr."),
                        new MyDate(5, 4, 1998),
                        new MyDate(15, 1, 2023),
                        250,
                        15
                ),
                new CommissionEmployee(
                        301,
                        new Name("Charlie", "B", "Brown"),
                        new MyDate(12, 7, 2001),
                        new MyDate(10, 2, 2022),
                        75000
                ),
                new BasePlusCommissionEmployee(
                        401,
                        new Name("David", "L", "Lee"),
                        new MyDate(8, 9, 2000),
                        new MyDate(1, 1, 2022),
                        60000,
                        20000
                )
        };

        int targetMonth = 9;

        System.out.println("======================================================================");
        System.out.println("POLYMORPHIC PAYROLL REPORT (Target Month: Sep)");
        System.out.println("======================================================================");

        for (int i = 0; i < employees.length; i++) {

            Employee employee = employees[i];

            double basePay = employee.computeSalary();
            double totalPay = employee.computeSalary(targetMonth);
            double birthdayBonus = totalPay - basePay;

            System.out.println();
            System.out.println((i + 1) + ". " + employee);
            System.out.println("   Base Pay: "
                    + String.format("%.2f", basePay)
                    + " | Birthday Bonus: "
                    + String.format("%.2f", birthdayBonus));

            System.out.println("   Total Payout: "
                    + String.format("%.2f", totalPay));
        }

        System.out.println();
        System.out.println("======================================================================");
        System.out.println("OBJECT CONTRACT TESTS (equals & hashCode)");
        System.out.println("======================================================================");

        HourlyEmployee emp1 = new HourlyEmployee(
                101,
                new Name("Alice", "M", "Smith"),
                new MyDate(18, 9, 2000),
                new MyDate(1, 6, 2022),
                45,
                200
        );

        HourlyEmployee emp1Identical = new HourlyEmployee(
                101,
                new Name("Alice", "M", "Smith"),
                new MyDate(18, 9, 2000),
                new MyDate(1, 6, 2022),
                45,
                200
        );

        HourlyEmployee emp2 = new HourlyEmployee(
                102,
                new Name("Alice", "M", "Smith"),
                new MyDate(18, 9, 2000),
                new MyDate(1, 6, 2022),
                45,
                200
        );

        System.out.println("emp1 equals emp1Identical: "
                + emp1.equals(emp1Identical));

        System.out.println("emp1 hashCode: " + emp1.hashCode()
                + " | emp1Identical hashCode: "
                + emp1Identical.hashCode()
                + " (Match: "
                + (emp1.hashCode() == emp1Identical.hashCode())
                + ")");

        System.out.println("emp1 equals emp2: "
                + emp1.equals(emp2));

        System.out.println();
        System.out.println("======================================================================");
        System.out.println("DEEP CLONE VERIFICATION");
        System.out.println("======================================================================");

        HourlyEmployee empOriginal = new HourlyEmployee(
                101,
                new Name("Alice", "M", "Smith"),
                new MyDate(18, 9, 2000),
                new MyDate(1, 6, 2022),
                45,
                200
        );

        HourlyEmployee empClone = empOriginal.clone();

        System.out.println("Original Name before modification: "
                + empOriginal.getEmpName());

        empClone.getEmpName().setFirstName("Taylor");

        System.out.println("Clone Name changed to: "
                + empClone.getEmpName());

        System.out.println("Original Name after modification: "
                + empOriginal.getEmpName());
    }
}