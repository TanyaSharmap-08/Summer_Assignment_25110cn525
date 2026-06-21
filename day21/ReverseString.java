import java.util.Scanner;
public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s=sc.nextLine();
        String r_s="";
        int i;
        s=s.toUpperCase();
        for(i=s.length()-1;i>=0;i--)
        {
            r_s+=s.charAt(i);
        }
        System.out.println("Original String : "+s);
        System.out.println("Reversed String : "+r_s);
    }
}