import java.util.Scanner;
public class decimaltobinary {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        n=sc.nextInt();
        String binary = "";
        while(n>0){
            int rem = n%2;
            binary = rem + binary;
            n=n/2;
        }
        System.out.println("Binary number: " + binary);
    }
}