import java.util.Scanner;
public class fact_f
{
    public void fact(int a)
    {
        int f=1;
        if(a==0)
        {
            System.out.println("Factorial of "+a+" is "+f);
        }
        else
        {
            for(int i=1;i<=a;i++)
            {
              f=f*i;
            }
            System.out.println("Factorial of "+a+" is "+f);
        }
    }
    public static void main(String[] args)
    {
        fact_f obj=new fact_f();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        obj.fact(n);
    }
}