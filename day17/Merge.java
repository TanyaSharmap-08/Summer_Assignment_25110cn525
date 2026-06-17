import java.util.Scanner;
public class Merge
{
    public static void main(String[] args)
    {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array : ");
        int n1=sc.nextInt();
        System.out.println("Enter size of second array : ");
        int n2=sc.nextInt();
        int a1[]=new int[n1];
        int a2[]=new int[n2];
        System.out.println("Enter element of first array : ");
        for(i=0;i<n1;i++)
        {
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter element of second array : ");
        for(i=0;i<n2;i++)
        {
            a2[i]=sc.nextInt();
        }
        int n=n1+n2;
        int arr[]=new int[n];
        for(i=0;i<n1;i++)
        {
            arr[i]=a1[i];
        }
        for(i=0;i<n2;i++)
        {
            arr[n1+i]=a2[i];
        }
        System.out.println("Array after merge : ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}