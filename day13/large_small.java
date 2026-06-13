import java.util.Scanner;
public class large_small
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements of array : ");
        int n=sc.nextInt();
        int a[] = new int[n];
        int i;
        System.out.println("Enter of elements of array : ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int small=a[0];
        int large=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]<small)
                small=a[i];
        }
        for(i=0;i<n;i++)
        {
            if(a[i]>large)
                large=a[i];
        }
        System.out.println(large+" is the largest element of array and "+small+" is the smallest element of array");
    }
}