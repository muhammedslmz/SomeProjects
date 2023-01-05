import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.print("How much number you want to enter: ");
        int n = inp.nextInt();
        int min=0, max=0,number;
        for(int i=1;i<=n;i++)
        {
            System.out.print("Enter the "+i+". number: ");
            number= inp.nextInt();
           if(i==1)
           {
               max=number;
               min=number;
           }
           else if (number<=min)
           {
               min=number;
           }
           else
           {
               max=number;
           }
        }
        System.out.println("Biggest number is: "+max);
        System.out.println("Smallest number is: "+min);
    }
}
