import java.util.Scanner;
public class fibonacci
{
    public void fibo(int n)
    {
        int f=0;
        int s=1;
        int t;
        System.out.println("The fibonacci series");
        for(int i=1;i<=n;i++)
        {
            System.out.print(f+" ");
            t=f+s;
            f=s;
            s=t;
        }
    }
    public static void main(String[] args)
    {
        fibonacci obj=new fibonacci();
        int x;
        System.out.println("Enter a number of terms : ");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        obj.fibo(x);
    }
}