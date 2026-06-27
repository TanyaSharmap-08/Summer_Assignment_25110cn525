import java.util.Scanner;
public class Student_Man
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the maximum capacity of record : ");
        int max=sc.nextInt();
        int roll[]=new int[max];
        String name[]=new String[max];
        double mark[]=new double[max];
        int count=0;
        int choice;
        do
        {
            System.out.println("STUDENT RECORD MANAGEMENT");
            System.out.println("1. Add student record");
            System.out.println("2. Display all record");
            System.out.println("3. Search student by roll number");
            System.out.println("4. Exit");
            System.out.println("Enter your choice : ");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    if(count<max){
                        System.out.println("Enter roll number : ");
                        roll[count]=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter student name : ");
                        name[count]=sc.nextLine();
                        System.out.println("Enter marks : ");
                        mark[count]=sc.nextDouble();
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
                        System.out.println("All Student records");
                        for(int i=0;i<count;i++){
                            System.out.println("Roll number : "+roll[i]+" Name : "+name[i]+" Marks : "+mark[i]);
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
                            if(roll[j]==search){
                                System.out.println("Record Found :");
                                System.out.println("Roll number : "+roll[j]);
                                System.out.println("Name : "+name[j]);
                                System.out.println("Marks : "+mark[j]);
                                found=true;
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("Student with roll number "+search+" not found.");
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
