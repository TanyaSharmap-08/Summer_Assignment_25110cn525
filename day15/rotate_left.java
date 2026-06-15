import java.util.Scanner;
public class rotate_left
{
    public void reverse(int arr[],int i,int j)
    {
        int temp;
        while(i<j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int arr[],int k)
    {
        k=k%arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    public static void main(String[] args)
    {
        rotate_right obj=new rotate_right();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of element of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        System.out.println("Enter of element of array : ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter number of rotation");
        int k=sc.nextInt();
        obj.rotate(a,k);
        System.out.println("After rotation : ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}