import java.util.Scanner;
public class power
{
    public static void main(String[] args) {
        int x,n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of x and n");
        x = sc.nextInt();
        n = sc.nextInt();
        int r=1;
        for(int i=1;i<=n;i++){
            r =r*x;
        }
        System.out.println("The result is "+r);
    }
}