package version4;

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
        return(count < max) ? (empList[count++] = emp) != null: false;
    }

    public Employee removeEmployee(int empID){
        int i;
        for(i = 0; i < count && empList[i].getEmpID() != empID; i++){}

        Employee newEmp = (i < count - 1) ? empList[i] : null;
        if(newEmp != null){
            for(int j = i; j < count - 1; j++){
                empList[j] = empList[j + 1];
                count--;
            }
            return newEmp;
        }
        return null;
    }

    public Employee searchEmployee(int empID){
        int i;
        for(i = 0; i < count && empList[i].getEmpID() != empID; i++){}
        Employee newEmp = empList[i];
        return(i < count) ? newEmp : null;
    }

    public int countHE(){
        int count = 0;
        int i;
        for(i = 0; i < count; i++){
            if(empList[i] instanceof HourlyEmployee){
                count++;
            }
        }
        return count;
    }

    public int countPWE(){
        int count = 0;
        int i;
        for(i = 0; i < count; i++){
            if(empList[i] instanceof PieceWorkerEmployee){
                count++;
            }
        }
        return count;
    }














}
