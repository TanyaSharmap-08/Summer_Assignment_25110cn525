import java.util.Scanner;
public class pair_sum
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,j,flag=0;
        System.out.println("Enter the elements of array : ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the sum of pair : ");
        int sum=sc.nextInt();
        System.out.println("Pair with given sum : ");
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]+a[j]==sum)
                {
                    System.out.println(a[i]+","+a[j]);
                    flag++;
                }
            }
        }
        if(flag==0)
            System.out.println("No pair found ");
    }
}