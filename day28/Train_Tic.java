import java.util.Scanner;
public class Train_Tic
{
    String name;
    int num;
    double amount;
    double total;
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the passenger name : ");
        name=sc.nextLine();
        System.out.println("Enter the number of ticket : ");
        num=sc.nextInt();
        System.out.println("Enter the amount : ");
        amount=sc.nextDouble();
    }
    public void calculate(){
        total=amount*num;
    }
    public void display(){
        System.out.println("Ticket booking receipt");
        System.out.println("Passenger name :"+name);
        System.out.println("Number of ticket : "+num);
        System.out.println("Total amount : "+total);
    }
    public static void main(String[] args){
        Train_Tic obj=new Train_Tic();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}