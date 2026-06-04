import java.util.Scanner;
public class prime_factor{
    public static void main(String[] args) {
        int n,i=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
       n= sc.nextInt();
       System.out.print("Prime factors of "+n+" are: ");
         for(i=1;i<=n;i++)
         {
             if(n%i==0)
             {
                 int count=0;
                 for(int j=1;j<=i;j++)
                 {
                     if(i%j==0)
                     {
                         count++;
                     }
                 }
                 if(count==2)
                 {
                     System.out.print(i+" ");
                 }
             }
         }
    }
}