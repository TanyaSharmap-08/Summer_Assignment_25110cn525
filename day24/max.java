import java.util.Scanner;
public class max
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s=sc.nextLine();
        int a[]=new int[256];
        int i;
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            a[ch]++;
        }
        int max=-1;
        char max_c=' ';
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(a[ch]>max)
            {
                max=a[ch];
                max_c=ch;
            }
        }
        System.out.println("Maximum occuring character is "+max_c+" which is "+max+" times");
    }
}