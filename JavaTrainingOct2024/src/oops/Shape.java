package oops;

public interface Shape {

    //constants
     int WORDS=100;//public static final

    //abstract methods
    abstract void draw();   //public
    double getPerimeter();  //public abstract
    double getArea();

    //default methods
    default void sendMsg(String s){
        System.out.println("Interface default method- sendMsg().... ");
        s="Hello"+s;
        System.out.println("S value is:"+s);
    }

    //static method
    static int getCube(int x){
        System.out.println("Interface static method- getCube().... ");
        int cube=x*x*x;
        return cube;
    }
    public static void main(String[]args){
        int cb=getCube(5);
        System.out.println("Cube value is:"+cb);
    }

}
