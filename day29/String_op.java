import java.util.Scanner;
public class String_op
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence :");
        String s=sc.nextLine();
        int choice;
        do{
            System.out.println("STRING OPERATION MENU");
            System.out.println("1.Reverse the string");
            System.out.println("2.Check if the string is palindrome");
            System.out.println("3.Count number of vowels and consonants");
            System.out.println("4.Convert to Upper Case and Lower Case");
            System.out.println("5.Enter a new string");
            System.out.println("6.Exit");
            System.out.println("Enter your choice : ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    String r_s="";
                    for(int i=s.length()-1;i>=0;i--){
                        r_s+=s.charAt(i);
                    }
                    System.out.println("Reversed String : "+r_s);
                    break;
                case 2:
                    String r_s1="";
                    for(int i=s.length()-1;i>=0;i--){
                        r_s1+=s.charAt(i);
                    }
                    if(s.equalsIgnoreCase(r_s1))
                        System.out.println("The string is palindrome");
                    else
                        System.out.println("The string is not palindrome");
                    break;
                case 3:
                    int v=0,c=0;
                    String temp=s.toLowerCase();
                    for(int j=0;j<temp.length();j++){
                        char ch=temp.charAt(j);
                        if(ch>='a'&&ch<='z'){
                            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                                v++;
                            else
                                c++;
                        }
                    }
                    System.out.println("Number of vowels : "+v);
                    System.out.println("Number of consonants : "+c);
                    break;
                case 4:
                    System.out.println("Uppercase : "+s.toUpperCase());
                    System.out.println("Lowercase : "+s.toLowerCase());
                    break;
                case 5:
                    System.out.println("Enter a new string : ");
                    s=sc.nextLine();
                    System.out.println("String updated successfully");
                    break;
                case 6:
                    System.out.println("Exiting the system. Thank you");
                    break;
                default:
                    System.out.println("Invalid choice ");  
            }
        }while(choice!=6);
    }
}