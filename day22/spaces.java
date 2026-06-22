import java.util.Scanner;
public class spaces
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s=sc.nextLine();
        String r="";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                r+=ch;
            }
        }
        System.out.println("String after removing spaces : "+r);
    }
}