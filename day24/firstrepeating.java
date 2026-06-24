import java.util.Scanner;
public class firstrepeating
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s=sc.nextLine();
        boolean found=false;
        char r=' ';
        for(int i =0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(s.indexOf(ch)!=s.lastIndexOf(ch))
            {
                r=ch;
                found=true;
                break;
            }
        }
        if(found)
            System.out.println("The first repeating character is  "+r);
        else
            System.out.println("There are no repeating character");
    }
}
