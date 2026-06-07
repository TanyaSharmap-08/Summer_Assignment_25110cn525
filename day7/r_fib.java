import java.util.Scanner;
public class r_fib
{
    int fib(int n)
    {
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        r_fib obj=new r_fib();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int x=sc.nextInt();
        System.out.println("Fibonacci Series:");
        for(int i=1;i<=x;i++)
        {
            System.out.print(obj.fib(i)+" ");
        }
    }
}
