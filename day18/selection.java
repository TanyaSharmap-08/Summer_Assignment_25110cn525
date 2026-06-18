import java.util.Scanner;
public class selection
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println(" Enter the number of element of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the element of array : ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int min,temp;
        for(i=0;i<n-1;i++)
        {
            min=i;
            for(j=i+1;j<n;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
        System.out.println("Sorted array : ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}