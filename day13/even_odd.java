import java.util.Scanner;
public class even_odd
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
        int even=0,odd=0;
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("Number of even elements = "+even);
        System.out.println("Number of odd elements = "+odd);
    }
}