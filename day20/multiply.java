import java.util.Scanner;
public class multiply
{
    public static void main(String[] args)
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and column of 1st matrix : ");
        int m1=sc.nextInt();
        int n1=sc.nextInt();
        int a[][]=new int [m1][n1];
        System.out.println("Enter number of rows and column of 2nd matrix : ");
        int m2=sc.nextInt();
        int n2=sc.nextInt();
        int b[][]=new int [m2][n2];
        int sum=0;
        if(n1!=m2)
            System.out.println("Multiplication not possible");
        else
        {
            System.out.println("Enter element of 1st array : ");
        for(i=0;i<m1;i++)
        {
            for(j=0;j<n1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter element of 2nd array : ");
        for(i=0;i<m2;i++)
        {
            for(j=0;j<n2;j++)
            {
                 b[i][j]=sc.nextInt();
            }
        }
        int c[][]=new int[m1][n2];
        for(i=0;i<m1;i++)
        {
            for(j=0;j<n2;j++)
            {
                for(int k=0;k<n1;k++)
                {
                    sum=sum+(a[i][k]*b[k][j]);
                }
                c[i][j]=sum;
                sum=0;
            }
        }
        System.out.println("Multiply: ");
        for(i=0;i<m1;i++)
        {
            for(j=0;j<n2;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        }
    }
}