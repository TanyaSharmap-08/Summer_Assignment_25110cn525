import java.util.Scanner;
public class gcd
{
    public static void main(String[] args)
    {
        int a,b,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        a=sc.nextInt();
        System.out.println("Enter the second number:");
        b=sc.nextInt();
        while(b>0)
        {
            temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("GCD is: "+a);
    }
}