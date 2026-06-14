import java.util.Scanner;
public class lineasearch
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
        int flag=0;
        System.out.println("Enter element to search : ");
        int num=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==num)
                flag++;
        }
        if(flag!=0)
            System.out.println(num+" is present ");
        else
            System.out.println(num+" is not present ");
    }
}