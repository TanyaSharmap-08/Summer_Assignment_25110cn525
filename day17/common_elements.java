import java.util.Scanner;
public class common_elements
{
    public static void main(String[] args)
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array : ");
        int n1=sc.nextInt();
        System.out.println("Enter size of second array : ");
        int n2=sc.nextInt();
        int a1[]=new int[n1];
        int a2[]=new int[n2];
        System.out.println("Enter element of first array : ");
        for(i=0;i<n1;i++)
        {
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter element of second array : ");
        for(i=0;i<n2;i++)
        {
            a2[i]=sc.nextInt();
        }
        System.out.println("Common elements of array : ");
        for(i=0;i<n1;i++)
        {
            for(j=0;j<n2;j++)
            {
                if(a1[i]==a2[j])
                {
                    System.out.print(a1[i]+" ");
                    break;
                }
            }
        }
    }
}