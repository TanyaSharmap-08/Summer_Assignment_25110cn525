import java.util.Scanner;
public class fibo_terms
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        int f=0,s=1,t;
        System.out.print("nth terms of fibonacci series: ");
        for(int i=1;i<=n;i++)
        {
            if(i==n)
            {
                System.out.print(f);
            }
            t=f+s;
            f=s;
            s=t;
        }
    }
}