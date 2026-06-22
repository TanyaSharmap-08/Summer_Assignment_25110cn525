import java.util.Scanner;
public class palindrome_s
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
        if(s.compareTo(r_s)==0)
            System.out.println(s+" is a palindrome string ");
        else
            System.out.println(s+" is a not palindrome string ");
    }
}