import java.util.Scanner;
public class Count
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s=sc.nextLine();
        int i;
        int count_v=0;
        int count_c=0;
        s=s.toLowerCase();
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                count_v++;
            else if((ch>='a'&& ch<='z'))
                count_c++;
        }
        System.out.println("Number of vowels = "+count_v);
        System.out.println("Number of consonents = "+count_c);

    }
}