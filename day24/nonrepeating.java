import java.util.Scanner;
public class nonrepeating
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s=sc.nextLine();
        boolean found=false;
        for(int i =0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(s.indexOf(ch)==s.lastIndexOf(ch))
            {
                System.out.println("The first non repeactung character : "+ch);
                found=true;
                break;
            }
        }
        if(!found)
            System.out.println("There are no non repeating character in the string ");
    }
}
