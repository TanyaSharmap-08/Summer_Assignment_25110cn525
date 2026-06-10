public class q4_10
{
    public static void main(String[] args) {
        char i,j;
        for(i='A';i<='E';i++)
        {
            for(j='A';j<=('E'-i+'A');j++)
            {
                System.out.print(" ");
            }
            for(j='A';j<=i;j++)
            {
                System.out.print(j);
            }
            for(j=(char)(i-1);j>='A';j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}