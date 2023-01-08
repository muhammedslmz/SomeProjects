
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number for fibonacci series:");
        int elements= inp.nextInt();
        int n;
        int x=0,y=0;
        for (int i= 0; i<=elements; i++)
        {
            if(i==0)
            {
                y=1;
                System.out.print(x+" ");
            }
            else
            {

                n=y;
                y=x+y;
                x=n;
                System.out.print(x+" ");
            }
        }
    }
}
