package oops;

public class Employee {
    //Instance variables-->accessmodifier datatype variablename=value;
    private String empName;
    private int empId;
    private double empSal;
    private String empDept;
    private static String companyName;

    public Employee(){

    }
    //Parameterized constructor
    protected Employee(String empName, int empId, double empSal, String empDept) {
        this.empName = empName;
        this.empId = empId;
        this.empSal = empSal;
        this.empDept = empDept;
    }

    public void employeDetails() {
        System.out.println("Print Employee class employee details:::::::::");
        System.out.println("Employee name is:" + getEmpName());
        System.out.println("Employee Id is:" + getEmpId());
        System.out.println("Employee sal is:" + getEmpSal());
        System.out.println("Employee dept is:" + getEmpDept());
    }


    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpId() {
        return empId;
    }

    public double getEmpSal() {
        return empSal;
    }

    public String getEmpDept() {
        return empDept;
    }

    public static String getCompanyName() {
        return companyName;
    }


    public static void main(String[] args) {
        Employee eObj = new Employee("Shiva", 1, 50000, "Chemistry");
        eObj.employeDetails();
    setCompanyName("Google");
    //String compN=getCompanyName();
        System.out.println("Employee company name is:" + getCompanyName());
    }
}
