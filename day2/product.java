import java.util.Scanner;
public class product
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
       int n=sc.nextInt();
       int pro=1,r;
       while(n>0)
       {
           r=n%10;
           pro=pro*r;
           n=n/10;
       }
       System.out.println("The product of digits is: " + pro);
    }
}