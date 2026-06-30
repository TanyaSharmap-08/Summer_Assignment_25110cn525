import java.util.Scanner;
public class MiniProject {
    static String names[];
    static int rollNumbers[];
    static double marks[];
    static int n;
    public static void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        n = sc.nextInt();
        names = new String[n];
        rollNumbers = new int[n];
        marks = new double[n];

        System.out.println("Enter Student Records");
        for (int i = 0; i<n; i++) {
            sc.nextLine();
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Enter roll number: ");
            rollNumbers[i] = sc.nextInt();
            System.out.print("Enter total marks attained (out of 100): ");
            marks[i] = sc.nextDouble();
            System.out.println();
        }
    }

    public static char calculate(double score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 75) {
            return 'B';
        } else if (score >= 50) {
            return 'C';
        } else {
            return 'D';
        }
    }
    public static void display() {
        System.out.println(" STUDENT REPORT SHEET");
        for (int i = 0; i < n; i++) {
            char grade = calculate(marks[i]);
            System.out.println("Name : "+names[i]+" Roll number : "+rollNumbers[i]+" Marks : "+marks[i]+" Grade : "+grade);
        }
    }
    public static void search() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the student to search: ");
        String searchName = sc.nextLine();
        
        boolean found = false;
        
        for (int i = 0; i < n; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                System.out.println(" Student Record Found");
                System.out.println("Name: " + names[i]);
                System.out.println("Roll Number: " + rollNumbers[i]);
                System.out.println("Marks obtained: " + marks[i]);
                System.out.println("Grade: " + calculate(marks[i]));
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Record not found for student: " + searchName);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Student Management Mini-Project System");
        accept();
        do {
            System.out.println("1. Display All Records & Grades");
            System.out.println("2. Search Student Record By Name");
            System.out.println("3. Exit Program");
            System.out.print("Enter your choice (1-3): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    System.out.println("Exiting the system. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);
    }
}