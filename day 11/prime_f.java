import java.util.Scanner;
public class prime_f
{
    public void prime(int a)
    {
        int count =0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            count++;
        }
        if(count==2)
            System.out.println(a+" is a Prime number ");
        else
            System.out.println(a+" is not a Prime number ");
    }
     public static void main(String[] args)
     {
        prime_f obj=new prime_f();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        obj.prime(n);
     }
}