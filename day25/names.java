import java.util.Scanner;
public class names
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of names : ");
        int n=sc.nextInt();
        String name[]=new String[n];
        int i,j;
        System.out.println("Enter "+n+" names : ");
        for(i=0;i<n;i++)
        {
            name[i]=sc.nextLine();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-1-i;j++)
            {
                if(name[j].compareToIgnoreCase(name[j+1])>0)
                {
                    String temp=name[j];
                    name[j]=name[j+1];
                    name[j+1]=temp;
                }
            }
        }
        System.out.println("Names in alphabetical order : ");
        for(i=0;i<n;i++)
        {
            System.out.println(name[i]);
        }
    }
}