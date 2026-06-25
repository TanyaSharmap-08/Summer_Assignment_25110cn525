import java.util.Scanner;
public class commonchar
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st string : ");
        String s1=sc.nextLine();
        System.out.println("Enter the 2nd string : ");
        String s2=sc.nextLine();
        System.out.println("Common character : ");
        String com="";
        for(int i=0;i<s1.length();i++)
        {
            char ch =s1.charAt(i);
            if(ch==' ')
            {
                continue;
            }
            if(s2.indexOf(ch)!=-1 && com.indexOf(ch)==-1)
            {
                System.out.print(ch+" ");
                com+=ch;
            }
        }
    }
}