import java.util.Scanner;
public class r_fac
{
    long fact(int n )
    {
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args)
    {
        r_fac obj=new r_fac();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int x=sc.nextInt();
        long fact=obj.fact(x);
        System.out.println("Factorial of "+x+" is "+fact);

    }
}