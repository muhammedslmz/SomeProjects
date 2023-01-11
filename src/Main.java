import java.util.Scanner;

    public class Main{
        static void prime(int n,int x){
            int sum=0;
            for (int i=1;i<=n;i++){
               if(n%i==0){
                   sum++;
               }

            }
            if(sum==2)
                System.out.println(n+" is prime number.");
            else System.out.println(n+" isn't prime number.");
        }

        public static void main(String []args){
            Scanner inp =new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = inp.nextInt();
            int x=n;
            prime(n,x);
        }
    }
