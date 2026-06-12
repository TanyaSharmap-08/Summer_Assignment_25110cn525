import java.util.Scanner;
public class armstrong
{
    public void arm(int n)
    {
        int r,sum=0,l=0;
        int num1=n;
        while(num1>0)
        {
            l++;
            num1=num1/10;
        }
        int num=n;
        while(num>0)
        {
            r=num%10;
            sum=sum+(int)Math.pow(r,l);
            num=num/10;
        }
        if(sum==n)
            System.out.println(n+" is a armstrong number.");
        else
            System.out.println(n+" is a armstrong number.");
    }
    public static void main(String[] args)
    {
        armstrong obj=new armstrong();
        int x;
        System.out.println("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        obj.arm(x);
    }
}