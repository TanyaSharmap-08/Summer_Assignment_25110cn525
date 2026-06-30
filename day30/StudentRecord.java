import java.util.Scanner;
public class StudentRecord
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the maximum number of students : ");
        int n=sc.nextInt();
        String name[]=new String[n];
        int roll[]=new int[n];
        double mark[]=new double[n];
        System.out.println("Enter STUDENT DETAILS");
        for(int i=0;i<n;i++)
        {
            System.out.println("Student "+(i+1)+":");
            System.out.println("Enter roll number : ");
            roll[i]=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name : ");
            name[i]=sc.nextLine();
            System.out.println("Enter marks : ");
            mark[i]=sc.nextDouble();
        }
        System.out.println("STUDENT RECORD");
        for(int i=0;i<n;i++)
        {
            System.out.println("Name : "+name[i]+" Roll number : "+roll[i]+" Marks : "+mark[i]);
        }
    }
}