import java.util.Scanner;
public class Quiz
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int score=0;
        String que[]={
            "1. How many bones are present in human bones ?\n(a)206 (b)208 (c)209 (d)207",
            "2. What is size of int data type ?\n(a)5bytes (b)1bytes (c)2bytes (d)3bytes",
            "3. How many players are present in cricket team ?\n(a)11 (b)13 (c)10 (d)12" };
        char c[]={'a','c','a'};
        System.out.println("WELCOME TO THE QUIZ");
        for(int i=0;i<que.length;i++)
        {
            System.out.println(que[i]);
            System.out.println("Your answer : ");
            char ch=sc.next().toLowerCase().charAt(0);
            if(ch==c[i]){
                System.out.println("Correct answer ");
                score++;
            }
            else{
                System.out.println("Incorrect answer ");
            }
        }
        System.out.println("Quiz finised ");
        System.out.println("You score : "+score);
    }
}