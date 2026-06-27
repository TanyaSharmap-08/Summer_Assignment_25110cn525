import java.util.Scanner;
public class EmployeeMan
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the maximum capacity of record : ");
        int max=sc.nextInt();
        int id[]=new int[max];
        String name[]=new String[max];
        double salary[]=new double[max];
        int count=0;
        int choice;
        do
        {
            System.out.println("EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("1. Add employee record");
            System.out.println("2. Display all record");
            System.out.println("3. Search employee by ID");
            System.out.println("4. Exit");
            System.out.println("Enter your choice : ");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    if(count<max){
                        System.out.println("Enter employee id  : ");
                        id[count]=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter employee name : ");
                        name[count]=sc.nextLine();
                        System.out.println("Enter monthly salary : ");
                        salary[count]=sc.nextDouble();
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
                        System.out.println("All Employee records");
                        for(int i=0;i<count;i++){
                            System.out.println("ID : "+id[i]+" Name : "+name[i]+" Monthly salary : "+salary[i]);
                        }
                    }
                    break;
                case 3:
                    if(count==0){
                        System.out.println("No record available to search ");
                    }
                    else{
                        System.out.println("Enter roll number to search : ");
                        int search=sc.nextInt();
                        boolean found=false;
                        for(int j=0;j<count;j++){
                            if(id[j]==search){
                                System.out.println("Record Found :");
                                System.out.println("ID : "+id[j]);
                                System.out.println("Name : "+name[j]);
                                System.out.println("Salary : "+salary[j]);
                                found=true;
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("Employee with id "+search+" not found.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting the system. Thank you");
                    break;
                default:
                    System.out.println("Invalid choice ");    
            }
        } while(choice!=4);
    }
}
