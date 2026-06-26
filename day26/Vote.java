import java.util.Scanner;
public class Vote
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible to vote ");
        }
        else{
            int year=18-age;
            System.out.println("You are not eligible to vote ");
            System.out.println("You can vote after "+year+" year");
        }
    }
}