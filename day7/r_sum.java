import java.util.Scanner;
public class r_sum
{
    int sum(int n)
    {
        if(n==0)
            return 0;
        else
            return (n%10)+sum(n/10);
    }
    public static void main(String[] args)
    {
        r_sum obj=new r_sum();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=sc.nextInt();
        int sum=obj.sum(x);
        System.out.println("The sum of digits is: "+sum);
    }
}