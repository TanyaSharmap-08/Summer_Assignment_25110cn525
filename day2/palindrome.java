import java.util.Scanner;
public class palindrome 
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        int rnum=0,r,num=n;
        while(num>0)
        {
            r=num%10;
            rnum=rnum*10+r;
            num=num/10;
        }
        if(n==rnum)
        {
            System.out.println("Palindrome number");
        }
        else
        {
            System.out.println("Not a palindrome number");
        }
    }
}