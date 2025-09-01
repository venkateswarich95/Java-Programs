package oops;

public class Mobile {
    //Instancde variables-->accessmodifier datatype variablename=value;
    private String deviceName;
    private int storage;
    private String model;
    private double screenSize;

    //Default constructor-->accessmodifier ClassName(){logic;}
    public Mobile(){
        System.out.println("Default constructor Mobile()....");
    }

    //Parameterized constructor-->accessmodifier ClassName(datatype p1...){logic;}
    public Mobile(String deviceName,int storage){
        System.out.println(" Parameterized constructor Mobile(p1..)....");
        this.deviceName=deviceName;
        this.storage=storage;
    }


    //Parameterized constructor-->accessmodifier ClassName(datatype p1...){logic;}
    public Mobile(String deviceName,int storage,String model,double screenSize){
       // System.out.println(" Passing mobile model & screensize using Parameterized constructor Mobile(p1..)....");
        this(deviceName,storage);
        this.model=model;
        this.screenSize=screenSize;
    }
    //Instance method-->accessmodifier void methodName(){logic};
    protected void mobileProperties(){
        System.out.println("Displaying mobile properties()....");
        System.out.println("Mobile Device name is:"+deviceName);//this.deviceName
        System.out.println(" Mobile Storage is:"+this.storage);
        System.out.println(" Mobile model is:"+this.model);
        System.out.println(" Mobile screen size is:"+this.screenSize);

    }

    public static void main(String[]args){
        Mobile mObj=new Mobile();
        mObj.mobileProperties();
        System.out.println("*******************************************");
        Mobile mObj1=new Mobile("OPPO F19 Pro+",128);
        mObj1.mobileProperties();
        System.out.println("*******************************************");
        Mobile mObj2=new Mobile("Vivo",18,"CPH2213",16.33);
        mObj2.mobileProperties();
        System.out.println("*******************************************");

    }
}
