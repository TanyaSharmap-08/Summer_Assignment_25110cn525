import java.util.Scanner;
public class mergearray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of first array : ");
        int n1=sc.nextInt();
        System.out.println("Enter size of second array : ");
        int n2=sc.nextInt();
        int a1[]=new int[n1];
        int a2[]=new int[n2];
        int i,j,k;
        System.out.println("Enter element of 1st array : ");
        for(i=0;i<n1;i++)
        {
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter element of 2nd array : ");
        for(i=0;i<n2;i++)
        {
            a2[i]=sc.nextInt();
        }
        int n=n1+n2;
        int arr[]=new int[n];
        i=0;
        j=0;
        k=0;
        while(i<n1 && j<n2)
        {
            if(a1[i]<a2[j])
            {
                arr[k]=a1[i];
                i++;
            }
            else
            {
                arr[k]=a2[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k]=a1[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=a2[j];
            j++;
            k++;
        }
        System.out.println("Merge sorted array : ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}