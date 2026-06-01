import java.util.Scanner;
public class reverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int rnum=0,r;
        while(num>0)
        {
            r=num%10;
            rnum=rnum*10+r;
            num=num/10;
        }
        System.out.println("Reverse of the number is:"+rnum);
    }
}