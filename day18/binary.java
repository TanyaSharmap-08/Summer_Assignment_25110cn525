import java.util.Scanner;
public class binary
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
        int mid,u=n-1,l=0,flag=0;
        System.out.println("Enter the serched elemet : ");
        int num=sc.nextInt();
        while(l<=u)
        {
            mid=l+(u-l)/2;
            if(a[mid]==num)
            {
                System.out.println(num+" is present at "+(mid+1)+" position.");
                flag++;
                break;
            }
            else if(a[mid]<num)
                l=mid+1;
            else
                u=mid-1;
        }
        if(flag==0)
            System.out.println("Element not present ");
    }
}