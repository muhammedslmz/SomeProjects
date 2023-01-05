import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = inp.nextInt();
        int divisionTotal=0;

        for (int i=1;i<n; i++)
        {
            if(n%i==0)
            {
                divisionTotal+=i;
            }

        }
        if(divisionTotal==n)
            System.out.println(n+" is the Excellent number.");
        else System.out.println(n+" isn't Excellent number.");
    }
}
