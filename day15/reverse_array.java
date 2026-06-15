import java.util.Scanner;
public class reverse_array
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of element of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        System.out.println("Enter of element of array : ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int temp,start=0, end=n-1;
        while(start<end)
        {
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reverse array : ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}