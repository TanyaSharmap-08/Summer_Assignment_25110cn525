import java.util.Scanner;
public class transpose
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
        System.out.println("Enter element of 1st array : ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                b[i][j]=a[j][i];
            }
        }
        System.out.println("Trnspose : ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}