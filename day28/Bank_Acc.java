import java.util.Scanner;
public class Bank_Acc
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the maximum capacity of record : ");
        int max=sc.nextInt();
        int number[]=new int[max];
        String name[]=new String[max];
        double balance[]=new double[max];
        int count=0;
        int choice;
        do
        {
            System.out.println("BANK CCOUNT");
            System.out.println("1. Add Bank details");
            System.out.println("2. Display all record");
            System.out.println("3.Search account by account number ");
            System.out.println("4. Withdraw money");
            System.out.println("5. Deposit money");
            System.out.println("6. Exit");
            System.out.println("Enter your choice : ");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    if(count<max){
                        System.out.println("Enter account number : ");
                        number[count]=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter account holder name : ");
                        name[count]=sc.nextLine();
                        System.out.println("Enter balance : ");
                        balance[count]=sc.nextDouble();
                        count++;
                        System.out.println("Record added successfully");               
                    }
                    else{
                        System.out.println("Database is full cannot add more record ");
                    }
                    break;
                case 2:
                    if(count==0){
                        System.out.println("No record found");
                    }
                    else{
                        System.out.println("All Bank account records");
                        for(int i=0;i<count;i++){
                            System.out.println("Account number : "+number[i]+"Account holder Name : "+name[i]+" Balance : "+balance[i]);
                        }
                    }
                    break;
                case 3:
                    if(count==0){
                        System.out.println("No record available to search ");
                    }
                    else{
                        System.out.println("Enter account number to search : ");
                        int search=sc.nextInt();
                        boolean found=false;
                        for(int j=0;j<count;j++){
                            if(number[j]==search){
                                System.out.println("Record Found :");
                                System.out.println("Account number : "+number[j]);
                                System.out.println("Account holder Name : "+name[j]);
                                System.out.println("Balance : "+balance[j]);
                                found=true;
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("Account with account number "+search+" not found.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter account number : ");
                    int accNum=sc.nextInt();
                    int idx=-1;
                    for(int j=0;j<count;j++){
                        if(number[j]==accNum){
                            idx=j;
                            break;
                        }
                    }
                    if(idx!=-1){
                        System.out.println("Enter the amount to withdraw :");
                        int amount=sc.nextInt();
                        if(amount>0&&amount<=balance[idx])
                            balance[idx]-=amount;
                        else if(amount>balance[idx])
                            System.out.println("Insufficient balance transition failed");
                        else
                            System.out.println("Invalid withdrawl amount");
                    }
                    else{
                        System.out.println("Account not found");
                    }
                    break;
                case 5:
                    System.out.println("Enter account number : ");
                    int accNum2=sc.nextInt();
                    int idx2=-1;
                    for(int j=0;j<count;j++){
                        if(number[j]==accNum2){
                            idx2=j;
                            break;
                        }
                    }
                    if(idx2!=-1){
                        System.out.println("Enter amount to deposit : ");
                        int amount=sc.nextInt();
                        if(amount>0)
                            balance[idx2]+=amount;
                        else
                            System.out.println("Invalid deposisted amount");
                    }
                    else{
                        System.out.println("Account not found");
                    }
                    break;
                case 6:
                    System.out.println("Exiting the system. Thank you");
                    break;
                default:
                    System.out.println("Invalid choice ");    
            }
        } while(choice!=6);
    }
}

