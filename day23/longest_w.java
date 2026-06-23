import java.util.Scanner;
public class longest_w
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String s=sc.nextLine();
        s=s.trim();
        String w="";
        String l_w="";
        int i;
        for(i=0;i<s.length();i++)
        {
            char ch =s.charAt(i);
            if(ch!=' ')
            {
                w+=ch;
            }
            else
            {
                if(w.length()>l_w.length())
                {
                    l_w=w;
                }
                w="";
            }
        }
        System.out.println("The longest word is "+l_w+" whose length is "+l_w.length());
    }
}