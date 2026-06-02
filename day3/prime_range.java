import java.util.Scanner;
public class prime_range 
{
    public static void main(String[] args)
    {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        m = sc.nextInt();   
        n = sc.nextInt();
        System.out.println("Prime numbers between "+m+" and "+n+" are:");
        for(int i=m;i<=n;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println(i + " ");
            }
        }
    }
}