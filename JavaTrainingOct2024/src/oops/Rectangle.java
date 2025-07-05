package oops;

public class Rectangle implements Shape{

    int l;
    int b;

    //parameterized constructor
    public Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    @Override
    public void draw() {
        System.out.println("Rectangle class draw()");
    }

    @Override
    public double getPerimeter() {
        double p=2*(l+b);
        return p;
    }

    @Override
    public double getArea() {
        double a=l*b;
        return a;
    }

    @Override
    public void sendMsg(String s) {
        Shape.super.sendMsg(s);
    }

    public static void main(String[]args){
        Shape sh=new Rectangle(7,15);
        //Rectangle c=new Rectangle(6,8);
        sh.draw();
        double getPer=sh.getPerimeter();
        System.out.println("Perimeter of a circle is:"+getPer);
        double getAr=sh.getArea();
        System.out.println("Area of a circle is:"+getAr);
    }
}
