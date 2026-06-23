import java.util.Scanner;
public class rotation
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st string : ");
        String s1=sc.nextLine();
        System.out.println("Enter the 2nd string : ");
        String s2=sc.nextLine();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()!=s2.length())
        {
            System.out.println("The string are not rotations of each other . ");
        }
        else
        {
            String str=s1+s1;
            if(str.contains(s2))
                System.out.println("The string are rotations of each other . ");
            else
                System.out.println("The string are not rotations of each other . ");
        }
    }
}