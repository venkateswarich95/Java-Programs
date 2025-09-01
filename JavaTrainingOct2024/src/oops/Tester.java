package oops;

public class Tester extends Employee{

    protected Tester(String empName, int empId, double empSal, String empDept) {
        super(empName, empId, empSal, empDept);
    }

    public static void designTests(){
        System.out.println("Tester class, static void designTests()....");
        System.out.println("Design the testcases based on requireements");
    }

    public void executeTestApp(){
        System.out.println("Tester class,non-static void executeTestApp()....");
        System.out.println("Execute the testcases once build is deployed");
    }
public static void main(String[]args){
    Tester t=new Tester("Padma",4865,60000,"Agriculture");
    System.out.println("Employee name is:" + t.getEmpName());
    System.out.println("Employee Id is:" + t.getEmpId());
    System.out.println("Employee salary is:" + t.getEmpSal());
    System.out.println("Employee department is:" + t.getEmpDept());
    //static methods
    setCompanyName("Amyanta");
    System.out.println("Company name is:"+getCompanyName()); //Employee class

}
}
