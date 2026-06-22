import java.util.Scanner;
public class frequency_c
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        System.out.println("Character frequencies : ");
        for(int i=0;i<ch.length;i++)
        {
            int count =1;
            if(ch[i]=='\0')
            {
                continue;
            }
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                    {
                        count++;
                        ch[j]='\0';
                    }
            }
            System.out.println(ch[i]+" : "+count);
        }
    }
}