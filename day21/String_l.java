import java.util.Scanner;
public class String_l
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s=sc.nextLine();
        int length=s.lastIndexOf("");
        System.out.println("Length of string = "+length);
    }
}