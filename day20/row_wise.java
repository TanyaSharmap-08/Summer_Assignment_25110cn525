import java.util.Scanner;
public class row_wise
{
    public static void main(String[] args)
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and column of matrix : ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int [m][n];
        System.out.println("Enter element of array : ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Row-wise sum : ");
        for(i=0;i<m;i++)
        {
            int row_sum=0;
            for(j=0;j<n;j++)
            {
                row_sum=row_sum+a[i][j];
            }
            System.out.println("Sum of row "+(i+1)+"= "+row_sum);
        }
    }
}