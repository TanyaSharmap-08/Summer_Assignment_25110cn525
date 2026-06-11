import java.util.Scanner;
public class sum {
    int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter second number:");
        int n2 = sc.nextInt();
        sum obj = new sum();
        int sum = obj.sum(n1, n2);
        System.out.println("The sum is: " + sum);
    }
}
