import java.util.Scanner;
public class compression
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s=sc.nextLine();
        if(s.length()==0)
        {
            System.out.println("Compressed string : ");
            return;
        }
        String c="";
        int count=1,i;
        for(i=0;i<s.length();i++)
        {
            if(i+1<s.length()&& s.charAt(i)==s.charAt(i+1))
            {
                count++;
            }
            else
            {
                c+=s.charAt(i)+""+count;
                count=1;
            }
        }
        System.out.println("Compressed string : "+c);
    }
}