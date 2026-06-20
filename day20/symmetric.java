import java.util.Scanner;
public class symmetric
{
    public static void main(String[] args)
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and column of matrix : ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int [m][n];
        int b[][]=new int[n][m];
        System.out.println("Enter element of array : ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        if(m==n)
        {
            for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                b[i][j]=a[j][i];
            }
        }
        int temp = 1;
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
            {
                if(a[i][j] != b[i][j])
                {
                    temp = 0;
                    break;
                }
            }
            if(temp == 0)
                break;
        }
        if(temp == 1)
            System.out.println("The matrix is symmetric matrix");
        else
            System.out.println("The matrix is not symmetric matrix");
        }
        else
            System.out.println("The matrixis not symmetric matrix");
    }
}