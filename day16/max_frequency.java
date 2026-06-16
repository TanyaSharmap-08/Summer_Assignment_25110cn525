import java.util.Scanner;
public class max_frequency
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,j;
        System.out.println("Enter the elements of array : ");
        for(i=1;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max_e=a[0];
        int max_c=0;
        for(i=0;i<n;i++)
        {
            int count=0;
            for(j=0;j<n;j++)
            {
                if(a[i]==a[j])
                    count++;
            }
            if(count>max_c)
            {
                max_c=count;
                max_e=a[i];
            }
        }
        System.out.println("Element with maximum frequency is "+max_e+" freqyency = "+max_c);
    }
}