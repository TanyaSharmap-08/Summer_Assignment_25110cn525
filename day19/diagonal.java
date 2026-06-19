import java.util.Scanner;
public class diagonal
{
    public static void main(String[] args)
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and column of matrix : ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int [m][n];
        int sum=0;
        System.out.println("Enter element of 1st array : ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if((i==j)||(i+j==(n-1)))
                    sum=sum+a[i][j];
            }
        }
        System.out.println("Sumof diagonals : "+sum);
    }
}