import java.util.Scanner;
public class ATM
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Pin code :");
        int pin=sc.nextInt();
        System.out.println("Bank Balance : ");
        double balance=sc.nextDouble();
        int choice;
        System.out.println("Welcome to ATM ");
        System.out.println("Enter the pin code : ");
        int e_pin=sc.nextInt();
        if(e_pin!=pin){
            System.out.println("Incorrect PIN.Access Denied ");
        }
        else{
            do{
                System.out.println("ATM Menu");
                System.out.println("1. Check balance");
                System.out.println("2.Deposit Money ");
                System.out.println("3.Withdraw money");
                System.out.println("4.Exit");
                System.out.println("Choose an option : ");
                choice=sc.nextInt();
                switch(choice)
                {
                    case 1: System.out.println("Current balance : "+balance);
                    break;
                    case 2: System.out.println("Enter amount to deposit : ");
                    double deposit=sc.nextInt();
                    if(deposit>0)
                    {
                        balance+=deposit;
                        System.out.println("Successfully deposited : "+deposit);
                        System.out.println("Updated Balance : "+balance);
                    }
                    else{
                        System.out.println("Invalid amount.");
                    }
                    break;
                    case 3: System.out.println("Enter the amount : ");
                    double withdraw=sc.nextInt();
                    if(withdraw>balance){
                        System.out.println("Insufficient fund. Transaction failed. ");
                    }
                    else if(withdraw<=0){
                        System.out.println("Invalid amount ");
                    }
                    else{
                        balance-=withdraw;
                        System.out.println("Successfully withdraw : "+withdraw);
                        System.out.println("Remaining balance : "+balance);
                    }
                    break;
                    case 4: System.out.println("ThaNkyou for using our ATM.");
                    break;
                    default: System.out.println("Invalid option");
                }
            }while(choice!=4);
        }
    }
}