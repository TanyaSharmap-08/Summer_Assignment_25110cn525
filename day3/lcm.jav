import java.util.Scanner;
public class lcm
{
    public static void main(String[] args)
    {
        int a,b,temp,lcm;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        a=sc.nextInt();
        int a1=a;
        System.out.println("Enter the second number:");
        b=sc.nextInt();
        int b1=b;
        while(b>0)
        {
            temp=b;
            b=a%b;
            a=temp;
        }
        lcm=(a1*b1)/a;
        System.out.println("LCM is: "+lcm);
    }
}