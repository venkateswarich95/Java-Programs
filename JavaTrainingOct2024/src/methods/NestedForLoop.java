package methods;

public class NestedForLoop {
    //non static methods

    // write a program to print Diamond shape
    public static void printDiamondShape(){
        System.out.println("Started executing printDiamondShape()............");
        int n=5;
        //first half
        for(int i=1;i<=n;i++){
            //print the spaces
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            //print the stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //second half
        for(int i=n-1;i>=1;i--){
            //print the spaces
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("********End of  printDiamondShape()***********");
    }

    //write a program to print pyramid shape
    private static void printPyramid(){
        System.out.println("******Started executing printPyramid()*********");
        int n=5;
        for(int i=1;i<=n;i++){
            //print the spaces
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            //print the stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("********End of printPyramid()****");
    }
    /**
     * This program displays a square pattern of stars.
     *  accessmodifier void methodName(){logic;}
     */
    public void printSquarePattern(){
        System.out.println("Started executing printSquarePattern()............");
        /*
        for(initialization;condition;increment/decrement){
        //Body of outer for loop
            for(initialization;condition;increment/decrement){
            //Body of inner for loop
            }
           }
         */
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    /**
     * This program displays pair if numbers
     *  accessmodifier void methodName(datatype p1){logic;}
     */
    private void printPairOfNumbrs(int x,int y){
        System.out.println("Started executing printPairOfNumbrs().....");
        for(int i=1; i<=x;i++){
            for(int j=1; j<=y;j++){
                System.out.println(i+","+j);
            }
        }
    }

    public static void main(String[]args){
        //Create object for that class using new keyword
        NestedForLoop nfObj=new NestedForLoop();
        nfObj.printSquarePattern();
        nfObj.printPairOfNumbrs(3,5);
        printDiamondShape();
        printPyramid();
    }
}
