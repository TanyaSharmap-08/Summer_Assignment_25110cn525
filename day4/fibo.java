import java.util.Scanner;
public class fibo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci sequence:");
        int n = sc.nextInt();
        int f=0,s=1,t;
        System.out.println("Fibonacci sequence:");
        for(int i=1;i<=n;i++)
        {
            System.out.print(f+" ");
            t=f+s;
            f=s;
            s=t;
        }
    }
}