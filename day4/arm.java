import java.util.Scanner;
public class arm{
    public static void main(String[] args) {
        int n,r,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        int n1=n,l=0;
        while(n1>0)
        {
            n1=n1/10;
            l++;
        }
        int n2=n;
        while(n2>0)
        {
            r=n2%10;
            sum=sum+(int)Math.pow(r,l);
            n2=n2/10;
        }
        if(sum==n)
        {
            System.out.println(n+" is an armstrong number.");
        }
        else
        {
            System.out.println(n+" is not an armstrong number.");
        }
    }
    
}