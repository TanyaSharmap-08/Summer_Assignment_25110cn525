import java.util.Scanner;
public class strong{
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();
        int num=n;
        while(n>0){
            int r=n%10;
            int fact=1;
            for(int i=1;i<=r;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==num){
            System.out.println(num+" is a strong number");
        }
        else{
            System.out.println(num+" is not a strong number");
        }
    }
}