import java.util.Scanner;
public class sumofdigits{
   public static void main(String[] args) 
   {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    n=sc.nextInt();
    int r,sum=0;
    while(n>0)
    {
        r=n%10;
        sum=sum+r;
        n=n/10;
    }
    System.out.println("The sum of digits is "+sum);
   }    
}
