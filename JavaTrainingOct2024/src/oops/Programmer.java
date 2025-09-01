package oops;

public class Programmer extends Manager{


    protected Programmer(String empName, int empId, double empSal, String empDept) {
        super(empName, empId, empSal, empDept);
    }

    public static void designApplication(){
        System.out.println("Programmer class, static void designApplication()....");
        System.out.println("Programmer will design the application based on requireements");
    }

    public void fixBugs(){
        System.out.println("Programmer class,non-static void fixBugs()....");
        System.out.println("Programmer will fix the bugs based on priority");
    }

    public static void main(String[]args){
        //Static methods
        setCompanyName("Amyanta Group of industries");
        System.out.println("Company name is:"+getCompanyName()); //Employee class
        attendStatusCall();//Manager class
        designApplication();//Programmer class
        //Non static methods
        Programmer pObj=new Programmer("Kiran",4501,90000,"Snowflake");
        pObj.manageTeam();//MAnager class
        System.out.println("Employee name is:" + pObj.getEmpName());
        System.out.println("Employee Id is:" + pObj.getEmpId());
        System.out.println("Employee salary is:" + pObj.getEmpSal());
        System.out.println("Employee department is:" + pObj.getEmpDept());
    }
}
