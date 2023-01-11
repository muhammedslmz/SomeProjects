import java.util.Scanner;

public class Main {
public static int power(int a,int b){
    if(b==0)
        return 1;

    return a* power(a,(b-1));

}
    public static void main(String []args){
        Scanner inp =new Scanner(System.in);
        System.out.print("Please enter the base: ");
        int a= inp.nextInt();
        System.out.print("Please enter the exponent: ");
        int b = inp.nextInt();
        System.out.println(power(a,b));
    }
}