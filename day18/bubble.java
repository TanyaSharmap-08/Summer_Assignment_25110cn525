import java.util.Scanner;
public class bubble
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
        int temp;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array : ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}