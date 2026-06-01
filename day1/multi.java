import java.util.Scanner;
public class multi{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int mult;
        for(int i=1;i<=10;i++){
            mult=a*i;
            System.out.println(mult);
        }
    }
}