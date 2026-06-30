import java.util.Scanner;
public class MiniLib
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String books[] = {"Java Programming", "Concepts of Physics", "History of India", "Julius Caesar", "Chemistry Basics"};
        boolean isAvailable[] = {true, true, true, true, true};
        int choice;
        System.out.println(" Welcome to the Mini Library System ");
        
        do {
            System.out.println("1. View All Books");
            System.out.println("2. Issue a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.println(" Available Books List ");
                    for (int i = 0; i < books.length; i++) {
                        String status = isAvailable[i] ? "Available" : "Issued";
                        System.out.println((i + 1) + ". " + books[i] + " [" + status + "]");
                    }
                    break;
                    
                case 2:

                    System.out.print("Enter the name of the book you want to issue: ");
                    String issueBook = sc.nextLine();
                    boolean foundIssue = false;
                    
                    for (int i = 0; i < books.length; i++) {
                        if (books[i].equalsIgnoreCase(issueBook)) {
                            foundIssue = true;
                            if (isAvailable[i]) {
                                isAvailable[i] = false;
                                System.out.println("Success: '" + books[i] + "' has been issued to you.");
                            } else {
                                System.out.println("Sorry: '" + books[i] + "' is already issued to someone else.");
                            }
                            break;
                        }
                    }
                    if (!foundIssue) {
                        System.out.println("Error: Book not found in the library.");
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter the name of the book you want to return: ");
                    String returnBook = sc.nextLine();
                    boolean foundReturn = false;
                    
                    for (int i = 0; i < books.length; i++) {
                        if (books[i].equalsIgnoreCase(returnBook)) {
                            foundReturn = true;
                            if (!isAvailable[i]) {
                                isAvailable[i] = true;
                                System.out.println("Success: '" + books[i] + "' has been returned successfully.");
                            } else {
                                System.out.println("Alert: This book is already present in the library.");
                            }
                            break;
                        }
                    }
                    if (!foundReturn) {
                        System.out.println("Error: This book does not belong to our library.");
                    }
                    break;
                    
                case 4:
                    System.out.println("Thank you for using the Mini Library System!");
                    break;
                    
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }
}