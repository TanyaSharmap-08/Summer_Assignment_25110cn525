import java.util.Scanner;
public class arm_range
{
    public static void main(String[] args) {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range: ");
        m=sc.nextInt(); 
        n=sc.nextInt();
        System.out.println("Armstrong numbers between "+m+" and "+n+" are: ");
        for(int i=m;i<=n;i++)
        {
            int r,sum=0,l=0;
            int n1=i;
            while(n1>0)
            {
                n1=n1/10;
                l++;
            }
            int n2=i;
            while(n2>0)
            {
                r=n2%10;
                sum=sum+(int)Math.pow(r,l);
                n2=n2/10;
            }

            if(sum==i)
            {
                System.out.print(i+" ");
            }
    }
}
}

