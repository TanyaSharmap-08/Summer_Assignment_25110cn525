import java.util.Scanner;
public class Array_op
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the maximum size of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int count=0;
        int choice;
        do{
            System.out.println("ARRAY OPERAION MENU");
            System.out.println("1.Insert an element");
            System.out.println("2.Delete an element");
            System.out.println("3.Search an element");
            System.out.println("4.Display array");
            System.out.println("5.Exit");
            System.out.println("Enter your choice : ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    if(count<n){
                        System.out.println("Enter the element : ");
                        int num=sc.nextInt();
                        System.out.println("Enter the index position");
                        int pos=sc.nextInt();
                        if(pos<0||pos>count){
                            System.out.println("Invalid position");
                        }
                        else{
                            for(int i=count-1;i>=pos;i--){
                                a[i+1]=a[i];
                            }
                            a[pos]=num;
                            count++;
                            System.out.println("Element inserted successfully");
                        }
                    }
                    else{
                        System.out.println("Array overflow cannot insert more element");
                    }
                    break;
                case 2:
                    if(count==0){
                        System.out.println("Array underflow no element to delete");
                    }
                    else{
                        System.out.println("Enter the index position");
                        int pos=sc.nextInt();
                        if(pos<0||pos>=count){
                            System.out.println("Invalid position");
                        }
                        else{
                            System.out.println("Deleted element : "+a[pos]);
                            for(int i=pos;i<count-1;i++){
                                a[i]=a[i+1];
                            }
                            count--;
                        }
                    }
                    break;
                case 3:
                    if(count==0){
                        System.out.println("Array is empty");
                    }
                    else{
                        System.out.println("Enter the element to search : ");
                        int num=sc.nextInt();
                        int flag=-1;
                        for(int i=0;i<count;i++){
                            if(a[i]==num){
                                flag=i;
                                break;
                            }
                        }
                        if(flag!=-1)
                            System.out.println("Element found at position "+(flag+1));
                        else
                            System.out.println("Element not found");
                    }
                    break;
                case 4:
                    if(count==0){
                        System.out.println("Array is empty");
                    }
                    else{
                        System.out.println("Array elements : ");
                        for(int i=0;i<count;i++){
                            System.out.print(a[i]+" ");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting the system. Thank you");
                    break;
                default:
                    System.out.println("Invalid choice ");    
            }
        }while(choice!=5);
    }
}