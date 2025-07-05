package methods;

public class BreakContinueStatements {
    //Static methods

    /**
     * accessmodifier static void methodName(){logic;}
     * This program demonstrates break to exit a loop.
     */
    public static void breakDemo(){
        System.out.println("Started executing breakDemo().....");
        for(int i=1;i<=6;i++){
            if(i==5){
                break;
            }
            System.out.print(i+"\t");
        }
        System.out.println();
    }

    /**
     * This program demonstrates continue to skip remaining statements of iteration.
     * accessmodifier static void methodName(){logic;}
     */
    protected static void printEvenNumbrs(){
        System.out.println("Started executing printEvenNumbrs().........");
        for(int i=1;i<=10;i++){
            if(i%2!=0){
                continue;
            }
            System.out.print(i+"\t");
        }
        System.out.println();
    }



    public static void main(String[]args){
breakDemo();
printEvenNumbrs();
    }
}
