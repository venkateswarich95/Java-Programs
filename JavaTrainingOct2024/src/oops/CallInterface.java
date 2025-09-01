package oops;

public class CallInterface {
    public static void main(String[]args){
        Shape sh=new Rectangle(7,15);
        //Rectangle c=new Rectangle(6,8);
        sh.draw();
        double getPer=sh.getPerimeter();
        System.out.println("Perimeter of a circle is:"+getPer);
        double getAr=sh.getArea();
        System.out.println("Area of a circle is:"+getAr);
        //how to call default methods->obj.defaultMthod();
        sh.sendMsg("Good Morning");
        //how to call static methods of an interface->Interface.staticMthod();
        Shape.getCube(8);
        //how to call constant of an interface->Interface.constant;
        System.out.println("Shape constant value is:"+Shape.WORDS);
    }
}
