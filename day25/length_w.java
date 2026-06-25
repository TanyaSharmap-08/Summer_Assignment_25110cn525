import java.util.Scanner;
public class length_w
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String s=sc.nextLine();
        String word[]=s.split(" ");
        int n=word.length;
        int i,j;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(word[j].length()>word[j+1].length())
                {
                    String temp=word[j];
                    word[j]=word[j+1];
                    word[j+1]=temp;
                }
            }
        }
        System.out.println("Words sorted by length : ");
        for(i=0;i<n;i++)
        {
            if(!word[i].trim().isEmpty())
                System.out.println(word[i]);
        }
    }
}