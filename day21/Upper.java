import java.util.Scanner;
public class Upper
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s=sc.nextLine();
        int i;
        String u_s="";
        for(i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch>='a'&&ch<='z'){
                u_s+=(char)(ch-32);
            }
            else{
                     u_s+=ch;
            }
        }
        System.out.println("Uppercase String : "+u_s);
    }
}