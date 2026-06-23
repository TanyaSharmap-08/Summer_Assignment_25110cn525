import java.util.Scanner;
public class duplicates
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st string : ");
        String s=sc.nextLine();
        String str="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(str.indexOf(ch)==-1)
                str+=ch;
        }
        System.out.println("String after emving duplicates : "+str);
    }
}