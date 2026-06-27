import java.util.Scanner;
public class Marksheet
{
    int roll;
    String name;
    String section;
    double s1,s2,s3,s4,s5;
    double mark;
    double per;
    String grade;
    public void accept(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter roll number : ");
            roll=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name : ");
            name=sc.nextLine();
            System.out.println("Enter section :");
            section=sc.nextLine();
            System.out.println("Enter marks of english");
            s1=sc.nextDouble();
            System.out.println("Enter marks of hindi");
            s2=sc.nextDouble();
            System.out.println("Enter marks of maths");
            s3=sc.nextDouble();
            System.out.println("Enter marks of science");
            s4=sc.nextDouble();
            System.out.println("Enter marks of sst");
            s5=sc.nextDouble();
        }
    public void calculate()
    {
        mark=s1+s2+s3+s4+s5;
        per=mark/5.00;
        if(per>=90)
            grade="A";
        else if(per>=80)
            grade="B";
        else if(per>=60)
            grade="C";
        else if(per>=40)
            grade="D";
        else
            grade="FAIL";
    }    
    public void display(){
        System.out.println("REPORT CARD");
        System.out.println("Name : "+name);
        System.out.println("Roll no.: "+roll);
        System.out.println("Subject Marks ");
        System.out.println("Englsh : "+s1);
        System.out.println("Hindi : "+s2);
        System.out.println("Maths : "+s3);
        System.out.println("Science : "+s4);
        System.out.println("SST : "+s5);
        System.out.println("Total marks : "+mark);
        System.out.println("Percentage : "+per);
        System.out.println("Grade : "+grade); 
    }
    public static void main(String[] args){
        Marksheet obj=new Marksheet();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}