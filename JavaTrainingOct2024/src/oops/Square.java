package oops;

public class Square implements Shape{
    int side;
    //parameterized constructor
    public Square(int side){
        this.side=side;
    }

    @Override
    public void draw() {
        System.out.println("Square class draw()");
    }

    @Override
    public double getPerimeter() {
        double p=4*side;
        return p;
    }

    @Override
    public double getArea() {
        double a=side*side;
        return a;
    }

    public static void main(String[]args){
        Shape sh=new Square(7);
        //Square c=new Square(6);
        sh.draw();
        double getPer=sh.getPerimeter();
        System.out.println("Perimeter of a circle is:"+getPer);
        double getAr=sh.getArea();
        System.out.println("Area of a circle is:"+getAr);
    }
}
