package methods;

public class ControlStatements {

    //Static Methods
    /**
     * accessmodifier static void methodName(datatype p1){logic}
     * Write a program to find the bigger number
     */
    private static void ifDemo(int a,int b){
        System.out.println("Started executing ifDemo().....");
        if(a>b){
            System.out.println("I am inside if block.....");
            System.out.println("a is bigger than b");
        }
        System.out.println("********************");
    }

    /**
     * accessmodifier static void methodName(){logic}
     * Use logical operators between numbers(AND,OR,NOT)
     */
    public static void ifElseDemo(){
        System.out.println("Started executing ifElseDemo().with &&....");
        int x=100, y=70, z=95;
        if((x>y) && (x>z)){
            System.out.println("I am inside if block.....");
            System.out.println("x is bigger than y,z");
        }else{
            System.out.println("I am inside else block.....");
            System.out.println("********************");

        }
        System.out.println("Started executing ifElseDemo().with ||....");
        if((y>x) || (z>x)){
            System.out.println("I am inside if block.....");
            System.out.println("x is bigger than y,z");
        }else{
            System.out.println("I am inside else block.....");
            System.out.println("********************");

        }
    }

        /**
         * accessmodifier static void methodName(datatype p1){logic}
         * Write a program to check a student's grade and prints a message based on the score
         */
        static void nestedIfElseDemo(int score){
            System.out.println("Started executing nestedIfElseDemo().........");

            if(score>90){
                System.out.println("A Grade");
            }else if(score>80 && score<=90){
                System.out.println("B Grade");
            } else if (score>70 && score<=80) {
                System.out.println("c Grade");
            } else if (score>50 && score<=70) {
                System.out.println("D Grade");
            } else if (score>35 && score<=50) {
                System.out.println("E Grade");
            }else{
                System.out.println("F Grade");
            }

            System.out.println("**********************************");
        }

    /**
     * accessmodifier static void methodName(datatype p1){logic}
     * Write a program to check a given character is vowel or not
     */
    protected static void switchDemo(char vowel){
        System.out.println("Started execting switchDemo().............");
        switch (vowel){
            case 'a':
                System.out.println("a is a vowel");
                break;
            case 'e':
                System.out.println("e is a vowel");
                break;
            case 'i':
                System.out.println("i is a vowel");
                break;
            case 'o':
                System.out.println("o is a vowel");
                break;
            case 'u':
                System.out.println("u is a vowel");
                break;
            default:
                System.out.println("It is not a vowel");
        }

        System.out.println("**********************************");
    }


    private static boolean checkLeapYear(long yr){
        System.out.println("Check whether"+yr+" is leap year or not");
        if(yr%4==0 && yr%100!=0 || (yr % 400 == 0)){
            System.out.println("Given number "+yr+"is a leap year");
            return true;
        }else{
            System.out.println("Given number "+yr+" is not a leap year");
            return false;
        }
    }
    public static void main(String[]args){
       ifDemo(45,35);
        ifElseDemo();
        nestedIfElseDemo(65);
        switchDemo('h');
        checkLeapYear(2023);
    }
}
