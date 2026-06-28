import java.util.Scanner;
public class Lib_Man
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter maximum capacity of library : ");
        int n=sc.nextInt();
        String title[]=new String[n];
        String author[]=new String[n];
        int count=0;
        int choice;
        System.out.println("LIBRARY MANAGEMENT SYSTEM");
        do{
            System.out.println("1.Add a new book ");
            System.out.println("2.Display all the books");
            System.out.println("3.Search for a book ");
            System.out.println("4.Exit");
            System.out.println("Enter your choice : ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    if(count<n)
                    {
                        System.out.println("Enter the title of book : ");
                        title[count]=sc.next();
                        sc.nextLine();
                        System.out.println("Enter the author name : ");
                        author[count]=sc.nextLine();
                        count++;
                        System.out.println("Book added successfully");
                    }
                    else{
                        System.out.println("Library storage full ");
                    }
                    break;
                case 2:
                    if(count==0){
                        System.out.println("No book available");
                    }    
                    else{
                        System.out.println("Available books ");
                        for(int i=0;i<count;i++){
                            System.out.println("Book title : "+title[i]+" Author name : "+author[i]);
                        }
                    }
                    break;
                case 3:
                    if(count==0){
                        System.out.println("No book available to search ");
                    }
                    else{
                        System.out.println("Enter book title to search : ");
                        String search=sc.next();
                        sc.nextLine();
                        boolean found=false;
                        for(int j=0;j<count;j++){
                            if(title[j].equalsIgnoreCase(search)){
                                System.out.println("Book Found :");
                                System.out.println("Book title : "+title[j]);
                                System.out.println("Author Name : "+author[j]);
                                found=true;
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("Book with title "+search+" not found.");
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