import java.util.Scanner;
public class Calculator{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("MENU DRIVEN CALACULAOR");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multipliction");
        System.out.println("4.Division");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        System.out.println("Enter two number : ");
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        double result;
        switch(choice){
            case 1:
                result=n1+n2;
                System.out.println("Addition = "+result);
                break;
            case 2:
                if(n1>n2){
                    result=n1-n2;
                }
                else{
                    result=n2-n1;
                }
                System.out.println("Subtraction = "+result);
                break;
            case 3:
                result=n1*n2;
                System.out.println("Multiplication = "+result);
                break;
            case 4:
                if(n2!=0){
                    result=n1/n2;
                    System.out.println("Division = "+result);
                }
                else{
                    System.out.println("Error:Division by zero is not possible");
                }
                break;
            default :
                    System.out.println("Invalid choice");
        }
    }
}