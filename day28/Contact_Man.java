import java.util.Scanner;
public class Contact_Man
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter maximum capacity of contact : ");
        int n=sc.nextInt();
        String name[]=new String[n];
        long num[]=new long[n];
        int count=0;
        int choice;
        System.out.println("CONTACT MANAGEMENT SYSTEM");
        do{
            System.out.println("1.Add contact ");
            System.out.println("2.Display all the contact");
            System.out.println("3.Search for a contact by name ");
            System.out.println("4.Exit");
            System.out.println("Enter your choice : ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    if(count<n)
                    {
                        System.out.println("Enter the name : ");
                        name[count]=sc.next();
                        sc.nextLine();
                        System.out.println("Enter the contact number : ");
                        num[count]=sc.nextLong();
                        count++;
                        System.out.println("Contact added successfully");
                    }
                    else{
                        System.out.println("Contact storage full ");
                    }
                    break;
                case 2:
                    if(count==0){
                        System.out.println("No contact available");
                    }    
                    else{
                        System.out.println("Available contact ");
                        for(int i=0;i<count;i++){
                            System.out.println("Name : "+name[i]+" Contact number : "+num[i]);
                        }
                    }
                    break;
                case 3:
                    if(count==0){
                        System.out.println("No contact available to search ");
                    }
                    else{
                        System.out.println("Enter contact name to search : ");
                        String search=sc.next();
                        sc.nextLine();
                        boolean found=false;
                        for(int j=0;j<count;j++){
                            if(name[j].equalsIgnoreCase(search)){
                                System.out.println("Contact Found :");
                                System.out.println("Contact name : "+name[j]);
                                System.out.println("Phone number : "+num[j]);
                                found=true;
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("Contact name "+search+" not found.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting the system. Thank you");
                    break;
                default:
                    System.out.println("Invalid choice ");    
            }    
        }while(choice!=4);
    }
}