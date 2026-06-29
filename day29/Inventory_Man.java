import java.util.Scanner;
public class Inventory_Man
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter maximum capacity of inventory : ");
        int n=sc.nextInt();
        int id[]=new int[n];
        String name[]=new String[n];
        int qua[]=new int[n];
        double price[]=new double[n];
        int count=0;
        int choice;
        System.out.println("INVENTORY MANAGEMENT SYSTEM");
        do{
            System.out.println("1.Add a new item ");
            System.out.println("2.Display all the items");
            System.out.println("3.Search for a item ");
            System.out.println("4.Exit");
            System.out.println("Enter your choice : ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    if(count<n)
                    {
                        System.out.println("Enter the item id : ");
                        id[count]=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the item name : ");
                        name[count]=sc.nextLine();
                        System.out.println("Enter the quantity : ");
                        qua[count]=sc.nextInt();
                        System.out.println("Enter the price : ");
                        price[count]=sc.nextDouble();
                        count++;
                        System.out.println("Item added successfully");
                    }
                    else{
                        System.out.println("Inventory storage full ");
                    }
                    break;
                case 2:
                    if(count==0){
                        System.out.println("No item available");
                    }    
                    else{
                        System.out.println("Current inventory ");
                        for(int i=0;i<count;i++){
                            System.out.println("Item id : "+id[i]+" Item name : "+name[i]+" Quantity : "+qua[i]+" Price : "+price[i]);
                        }
                    }
                    break;
                case 3:
                    if(count==0){
                        System.out.println("No item available to search ");
                    }
                    else{
                        System.out.println("Enter item id to search : ");
                        int search=sc.nextInt();
                        sc.nextLine();
                        boolean found=false;
                        for(int j=0;j<count;j++){
                            if(id[j]==search){
                                System.out.println("Item Found :");
                                System.out.println("Item id : "+id[j]);
                                System.out.println("Item Name : "+name[j]);
                                System.out.println("Quantity : "+qua[j]);
                                System.out.println("Price : "+price[j]);
                                found=true;
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("Item with id "+search+" not found.");
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