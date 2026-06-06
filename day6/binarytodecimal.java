import java.util.Scanner;
public class binarytodecimal {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        n=sc.nextInt();
        int dec = 0;
        int p = 0;
        while(n>0){
            int r = n%10;
            dec+= r * Math.pow(2, p);
            p++;
            n=n/10;
        }
        System.out.println("Decimal number: " + dec);
    }
}