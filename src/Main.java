import java.util.Scanner;
public class Main{
    static int addition(int a, int b){
    int result=a+b;
        System.out.println("Sum: "+ result);
        return result;
    }

    static int extraction(int a,int b){
    int result=a-b;
        System.out.println("Result: "+result);
        return result;
    }

    static int multiplication(int a,int b){
        int result=a*b;
        System.out.println("Result : "+result);
    return result;
    }

    static int division(int a,int b){
        if (b==0){

            return 0;
        }
        int result=a/b;
        System.out.println("Result: "+result);
    return result;
    }

    static int exponent(int a,int b){
        int result=1;
        for(int i=0;i<b;i++)
            result *=a;
        System.out.println("Result: "+result);
        return result;
    }

    static void factorial(int a,int b) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println(a + "! : " + result);
        result = 1;
        for (int i = 1; i <= b; i++) {
            result *= i;
        }
        System.out.println(b + "! : " + result);
    }

    static int mod(int a,int b){
        int result=a%b;
        System.out.println("Result: "+result);
        return result;
    }

    static void perimeter(int a,int b){

        System.out.println("Result: "+(2*(a+b)));

    }


    public static void main(String []args){
        Scanner inp=new Scanner(System.in);
        int select;
        System.out.println("1-Addition\n2-Extraction\n3-Multiplication\n4-Division\n5-Exponent\n6-Factorial\n7-Mod\n8-Perimeter\n0-Exit");
        while (true){

            System.out.print("Select your process: ");
            select= inp.nextInt();
            if (select==0){
                break;
            }
            System.out.print("First number: ");
            int a = inp.nextInt();
            System.out.print("Second number: ");
            int b = inp.nextInt();
            switch (select) {
                case 1:
                    addition(a,b);
                    break;
                case 2:
                    extraction(a,b);
                    break;
                case 3:
                    multiplication(a,b);
                    break;
                case 4:
                    division(a,b);
                    break;
                case 5:
                    exponent(a,b);
                    break;
                case 6:
                    factorial(a,b);
                    break;
                case 7:
                    mod(a,b);
                    break;
                case 8:
                    perimeter(a,b);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You entered wrong value, please try again.");
            }

        }

        System.out.println("You are exited.");
    }
}