import java.util.Scanner;
public class NumberGuess
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int target=(int)(Math.random()*100)+1;
        int guess=0;
        int attempt=0;
        System.out.println("Welcome to Number Guessing Game ");
        System.out.println("I have entered a number between 1-100 ");
        System.out.println("Can you get what it is ?");
        while(guess!=target)
        {
            System.out.print("Enter the guess : ");
            guess=sc.nextInt();
            attempt++;
            if(guess<target){
                System.out.println(" Lower try a higher number  ");
            }
            else if(guess>target){
                System.out.println("Higher try a lower number ");
            }
            else{
                System.out.println("Congratulation You guessed the correct number");
                System.out.println("Total number of attempts : "+attempt);
            }
        }
    }
}