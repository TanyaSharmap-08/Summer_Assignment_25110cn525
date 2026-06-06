import java.util.Scanner;
public class setbits
{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        int count = 0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        System.out.println("Number of set bits: "+count);
    }
}