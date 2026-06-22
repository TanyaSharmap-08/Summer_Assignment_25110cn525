import java.util.Scanner;
public class count_w
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s=sc.nextLine();
        s=s.trim();
        int count=1;
        if(s.isEmpty())
        {
            System.out.println("Total number of words = 0");
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch==' '&&s.charAt(i+1)!=' ')
                    count++;
            }
            System.out.println("Total number of words = "+count);
        }
    }
}