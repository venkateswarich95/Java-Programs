package oops;

public class Dog {
    //Instance variables-->accessmodifier datatype variablename=value;
    private String name;
    private int age;
    private String breed;
    private String color;

    //Default constructor-->accessmodifier ClassName(){logic;}
    public Dog(){
        System.out.println("Default constructor in Dog class.....");
        System.out.println("Dog is an animal");
    }

    //parameterized constructor--accessmodifier ClassName(datatype p1..){}
    public Dog(String name,int age){
        System.out.println("Initaializing dog name & age through parameterized constructor...");
        this.name=name;
        this.age=age;
    }

    public Dog(String name,int age,String breed,String color){
        this(name,age);
        this.breed=breed;
        this.color=color;
    }
      protected void dogProperties(){
        System.out.println("Started printing dog properties...");
          System.out.println("Dog name is:"+this.name);
          System.out.println("Dog age is:"+age);
          System.out.println("Dog breed is:"+this.breed);
          System.out.println("Dog color is:"+this.color);
      }

    public static void main(String[]args){
        Dog dObj = new Dog();
        dObj.dogProperties();
        System.out.println("*********************************************");
        Dog dpObj = new Dog("Rambo", 6);
        dpObj.dogProperties();
        System.out.println("*********************************************");
        Dog dpObj1 = new Dog("Bunty", 5, "Russian blue", "Brown");
        dpObj1.dogProperties();
        System.out.println("*********************************************");


    }
}
