import java.util.Scanner;
public class r_reverse
{
    int r=0;
    int reverse(int n)
    {
        if(n==0)
        {
            return r;
        }
        else
        {
            r=(r*10)+n%10;
            return reverse(n/10);
        }
    }
    public static void main(String[] args)
    {
        r_reverse obj=new r_reverse();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=sc.nextInt();
        int r=obj.reverse(x);
        System.out.println("Reverse of the number is:"+r);
    }
}