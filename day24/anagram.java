import java.util.Arrays;
import java.util.Scanner;
public class anagram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st string : ");
        String s1=sc.nextLine();
        System.out.println("Enter the 2nd string : ");
        String s2=sc.nextLine();
        s1=s1.replaceAll("\\s","");
        s2=s2.replaceAll("\\s","");
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()!=s2.length())
        {
            System.out.println("The string is not anagram string");
        }
        else
        {
            char a1[]=s1.toCharArray();
            char a2[]=s2.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            if(Arrays.equals(a1,a2))
                System.out.println("The string is anagram string ");
            else
                System.out.println("The string is not anagram string ");
        }
    }
}