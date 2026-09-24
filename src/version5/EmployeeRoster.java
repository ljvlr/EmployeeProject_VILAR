package version5;

public class EmployeeRoster {

    private Employee[] empList;
    private int max;
    private int count;

    EmployeeRoster() {
        this.max = 10;
        this.count = 0;
        empList = new Employee[this.max];
    }

    public EmployeeRoster(int max) {
        this.max = max;
        empList = new Employee[this.max];
        this.count = 0;
    }

    public boolean addEmployee(Employee emp){
        return(count < max && emp != null) ? (empList[count++] = emp) != null: false;
    }

    public Employee removeEmployee(int empID){
        int i;
        for(i = 0; i < count && empList[i].getEmpID() != empID; i++){}

        if (i < count) {
            Employee newEmp = empList[i];

            for (int j = i; j < count - 1; j++) {
                empList[j] = empList[j + 1];
            }

            empList[count - 1] = null;
            count--;

            return newEmp;
        }

        return null;
    }

    public Employee searchEmployee(int empID){
        int i;
        for(i = 0; i < count && empList[i].getEmpID() != empID; i++){}
        return(i < count) ? empList[i] : null;
    }

    public int countHE(){
        int realCount = 0;
        int i;
        for(i = 0; i < count; i++){
            if(empList[i] instanceof HourlyEmployee){
                realCount++;
            }
        }
        return realCount;
    }

    public int countPWE(){
        int realCount = 0;
        int i;
        for(i = 0; i < count; i++){
            if(empList[i] instanceof PieceWorkerEmployee){
                realCount++;
            }
        }
        return realCount;
    }

    public int countCE() {
        int realCount = 0;
        int i;

        for (i = 0; i < count; i++) {
            if (empList[i].getClass() == CommissionEmployee.class) {
                realCount++;
            }
        }

        return realCount;
    }

    public int countBPCE() {
        int realCount = 0;
        int i;

        for (i = 0; i < count; i++) {
            if (empList[i] instanceof BasePlusCommissionEmployee) {
                realCount++;
            }
        }

        return realCount;
    }

    public void displayHE() {
        int i;

        for (i = 0; i < count; i++) {
            if (empList[i] instanceof HourlyEmployee) {
                HourlyEmployee he = (HourlyEmployee) empList[i];
                he.displayHourlyEmployee();
            }
        }
    }

    public void displayPWE() {
        int i;

        for (i = 0; i < count; i++) {
            if (empList[i] instanceof PieceWorkerEmployee) {
                PieceWorkerEmployee pwe =
                        (PieceWorkerEmployee) empList[i];

                pwe.displayPieceWorkerEmployee();
            }
        }
    }

    public void displayCE() {
        int i;

        for (i = 0; i < count; i++) {
            if (empList[i].getClass() == CommissionEmployee.class) {
                CommissionEmployee ce =
                        (CommissionEmployee) empList[i];

                ce.displayCommissionEmployee();
            }
        }
    }

    public void displayBPCE() {
        int i;

        for (i = 0; i < count; i++) {
            if (empList[i] instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee bpce =
                        (BasePlusCommissionEmployee) empList[i];

                bpce.displayBasePlusCommissionEmployee();
            }
        }
    }

    public void displayAllEmployees() {
        int i;

        for (i = 0; i < count; i++) {
            System.out.println(
                    (i + 1)
                            + ". ID: " + empList[i].getEmpID()
                            + " | Name: " + empList[i].getEmpName()
                            + " | Type: " + empList[i].getClass().getSimpleName()
            );
        }
    }

    public void displayPayroll(int currentMonth) {
        int i;

        for (i = 0; i < count; i++) {

            Employee emp = empList[i];
            double salary = 0;
            String type = "";

            if (emp instanceof BasePlusCommissionEmployee) {

                BasePlusCommissionEmployee bpce =
                        (BasePlusCommissionEmployee) emp;

                salary = bpce.computeSalary(currentMonth);
                type = "Base Plus Commission";

            } else if (emp instanceof CommissionEmployee) {

                CommissionEmployee ce =
                        (CommissionEmployee) emp;

                salary = ce.computeSalary(currentMonth);
                type = "Commission";

            } else if (emp instanceof PieceWorkerEmployee) {

                PieceWorkerEmployee pwe =
                        (PieceWorkerEmployee) emp;

                salary = pwe.computeSalary(currentMonth);
                type = "Piece Worker";

            } else if (emp instanceof HourlyEmployee) {

                HourlyEmployee he =
                        (HourlyEmployee) emp;

                salary = he.computeSalary(currentMonth);
                type = "Hourly";
            }

            if (emp.getBirthDate().getMonth() == currentMonth) {
                System.out.println(
                        "[" + type + "] ID: " + emp.getEmpID()
                                + " | Name: " + emp.getEmpName()
                                + " | Salary: "
                                + String.format("%.2f", salary)
                                + " (Birthday Bonus Applied)"
                );
            } else {
                System.out.println(
                        "[" + type + "] ID: " + emp.getEmpID()
                                + " | Name: " + emp.getEmpName()
                                + " | Salary: "
                                + String.format("%.2f", salary)
                );
            }
        }
    }
}
