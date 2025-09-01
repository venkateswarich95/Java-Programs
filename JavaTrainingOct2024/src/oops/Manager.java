package oops;

public class Manager extends Employee{
    //Instance variable
    private double bonus;

   public Manager(double bonus){
       this.bonus=bonus;
   }

    //parameterised constructor
    protected Manager(String empName, int empId, double empSal, String empDept) {
        super(empName, empId, empSal, empDept);
    }
    public void manageTeam() {
        System.out.println("Started executing Manager class manageTeam()......");
        System.out.println("Manager assign the tasks to employes");
    }
    public static void attendStatusCall(){
        System.out.println("Started executing Manager class attendStatusCall()......");
        System.out.println("Employees update their status to manager");
    }

    public static void main(String[]args){
        Employee eObj=new Employee("Harshini",1004,60000,"QA");
        eObj.employeDetails();
        System.out.println("************************************************************");
        Manager mObj=new Manager("Sahastra",67,15000.00,"Agriculture");
        System.out.println("Print employee details Using Manager class:::::::::");
        System.out.println("Employee name is:" + mObj.getEmpName());
        System.out.println("Employee Id is:" + mObj.getEmpId());
        System.out.println("Employee salary is:" + mObj.getEmpSal());
        System.out.println("Employee department is:" + mObj.getEmpDept());
        System.out.println("************************************************************");
        mObj.employeDetails();
        Manager m=new Manager(5000);
        System.out.println("Bonus is:"+m.bonus);
        setCompanyName("Infosys");
        System.out.println("Employee company name is:" + getCompanyName());
    }
}
