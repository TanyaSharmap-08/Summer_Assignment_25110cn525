import java.util.Scanner;
public class array
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
        System.out.println("Array : ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}