import java.util.Scanner;
public class duplicates
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,j,k;
        System.out.println("Enter the elements of array : ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    for(k=j;k<n-1;k++)
                    {
                        a[k]=a[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }
        System.out.println("Array after removing duplicates : ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}