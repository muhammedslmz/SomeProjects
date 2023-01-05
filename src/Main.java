

public class Main {
    public static void main(String[] args) {

        int divided=0;

        for(int i =2; i<100; i++)
        {

            for(int j =1; j<=i; j++)
            {
                if(i%j==0)
                    divided++;
            }
            if(divided==2)
                System.out.println(i);

            divided=0;

        }

    }
}
