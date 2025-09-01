package oops;

public class Circle implements Shape{
    double radius;

    //parameterized constructor
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public void draw() {
       System.out.println("Circle class draw()");
    }

    @Override
    public double getPerimeter() {
    double p=2*Math.PI*radius;
        return p;
    }

    @Override
    public double getArea() {
       double A=Math.PI*radius*radius;
        return A;
    }
    public static void main(String[]args){
        Shape sh=new Circle(7.9);
        //Circle c=new Circle(5.6);
        sh.draw();
        double getPer=sh.getPerimeter();
        System.out.println("Perimeter of a circle is:"+getPer);
        double getAr=sh.getArea();
        System.out.println("Area of a circle is:"+getAr);
    }
}
