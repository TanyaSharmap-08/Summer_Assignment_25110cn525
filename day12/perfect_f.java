import java.util.Scanner;
public class perfect_f
{
    public void perfect(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
        {
            System.out.println(n+" is a Perfect Number");
        }
        else
        {
            System.out.println(n+" is not a Perfect Number");
        }
    }
    public static void main(String[] args)
    {
        perfect_f obj=new perfect_f();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x= sc.nextInt();
        obj.perfect(x);
    }
}