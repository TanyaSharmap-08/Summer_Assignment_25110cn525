import java.util.Scanner;
public class secondlarge
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
        int large=a[0];
        int s_large=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]>large)
                large=a[i];
        }
        for(i=0;i<n;i++)
        {
            if(a[i]>s_large && a[i]<large)
                s_large=a[i];
        }
        System.out.println(s_large+" is the second largest element");
    }
}