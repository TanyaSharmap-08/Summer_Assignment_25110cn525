import java.util.Scanner;
public class Missing_num
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,j;
        System.out.println("Enter the elements of array : ");
        for(i=1;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int a_sum=(n*(n+1))/2;
        int sum=0,num;
        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        num=a_sum-sum;
        System.out.println("Enter the missing elements of array : "+num);
    }
}