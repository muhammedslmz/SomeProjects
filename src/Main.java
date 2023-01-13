import java.util.Scanner;

public class Main {
    public static void design(int n) {
        System.out.print(n+" ");
        if(n<=0) {
            return;
        }
        design(n-5);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        int n = input.nextInt();
        design(n);
    }
}