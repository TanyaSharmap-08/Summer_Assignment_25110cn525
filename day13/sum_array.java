import java.util.Scanner;
public class sum_array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements of array : ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("Enter of elements of array : ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int avg;
        for(i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        avg=sum/n;
        System.out.println("Sum of array = "+sum);
        System.out.println("Average of array = "+avg);
    }
}