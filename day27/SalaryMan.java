import java.util.Scanner;
public class SalaryMan
{
    int id;
        String name;
        double salary;
        double da;
        double hra;
        double pf;
        double gross;
        double net;
        public void accept(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter employee ID : ");
            id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter employee name : ");
            name=sc.nextLine();
            System.out.println("Enter salary :");
            salary=sc.nextDouble();
        }
        public void calculate(){
            da=0.30*salary;
            hra=0.15*salary;
            pf=0.12*salary;
            gross=salary+da+hra;
            net=gross-pf;
        }
        public void display(){
            System.out.println("EMPLOYEE SALARY");
            System.out.println("ID : "+id);
            System.out.println("Name : "+name);
            System.out.println("Basic salary : "+salary);
            System.out.println("DA(30%) : "+da);
            System.out.println("HRA(15%) : "+hra);
            System.out.println("PF(12%) : "+pf);
            System.out.println("Gross salary : "+gross);
            System.out.println("Net salary : "+net);
        }
    public static void main(String[] args)
    {
        SalaryMan obj=new SalaryMan();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}