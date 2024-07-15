package patterns;
import java.util.Scanner;

public class trianglePattern {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("  Enter no of rows: ");
        int n = sc.nextInt();

        // right-angled solid triangle on the right side
        for(int i = 1;i <= n;i++) 
        {
            for(int j = n - i;j >= 1;j--) 
                System.out.print("  ");
            for(int j = 1;j <= i;j++)
                System.out.print("* ");
            System.out.println();
        }

        System.out.println();

        // right-angled solid triangle normally printed
        for(int i = 1; i <= n;i++) {
            for(int j = 1;j <= i;j++)
                System.out.print("* ");
            System.out.println();
        }

        System.out.println();

        // right-angled triangle with no of *s on each row being odd
        for(int i = 1; i <= n;i++) {
            for(int j = 1;j <= 2*i-1;j++)
                System.out.print("* ");
            System.out.println();
        }


        // number triangle on left side
        for(int i = 1; i <= n;i++) {
            for(int j = 1;j <= i;j++)
                    System.out.print(j+" ");
            System.out.println();
        }

        System.out.println();

        for(int i = 1; i <= n;i++) {
            for(int j = 1;j <= i;j++)
                    System.out.print(i+" ");
            System.out.println();
        }

    }
}
