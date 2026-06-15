import java.util.Scanner;
public class zero_end
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
        int temp=0;
        for(i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                a[temp]=a[i];
                temp++;
            }
        }
        for(i=temp;i<n;i++)
        {
            a[i]=0;
        }
        System.out.println("After moving  : ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}