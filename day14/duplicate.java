import java.util.Scanner;
public class duplicate
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements of array : ");
        int n=sc.nextInt();
        int a[] = new int[n];
        int i,j;
        System.out.println("Enter of elements of array : ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int temp=0;
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
        System.out.println("Duplicate elements : ");
        for(i=0;i<n-1;i++)
        {
            if(a[i]==a[i+1])
                System.out.println(a[i]);
        }
    }
}