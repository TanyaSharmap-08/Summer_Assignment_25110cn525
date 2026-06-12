import java.util.Scanner;
public class palindrome
{
    public void palindrome(int n)
    {
        int r,rnum=0;
        int num=n;
        while(num>0)
        {
            r=num%10;
            rnum=rnum*10+r;
            num=num/10;
        }
        if(rnum==n)
            System.out.println(n+" is a palindrome number.");
        else
            System.out.println(n+" is a palindrome number.");
    }
    public static void main(String[] args)
    {
        palindrome obj=new palindrome();
        int x;
        System.out.println("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        obj.palindrome(x);
    }
}