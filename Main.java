package management;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Adding a student
                    System.out.print("Enter name: ");
                    scanner.nextLine(); // Consume newline
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    System.out.print("Enter grade: ");
                    scanner.nextLine(); // Consume newline
                    String grade = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();

                    Student student = new Student(name, rollNumber, grade, email);
                    sms.addStudent(student);
                    break;

                case 2:
                    // Removing a student
                    System.out.print("Enter roll number to remove: ");
                    int rollNumToRemove = scanner.nextInt();
                    sms.removeStudent(rollNumToRemove);
                    break;

                case 3:
                    // Searching for a student
                    System.out.print("Enter roll number to search: ");
                    int rollNumToSearch = scanner.nextInt();
                    Student foundStudent = sms.searchStudent(rollNumToSearch);
                    if (foundStudent != null) {
                        System.out.println("Student found: " + foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    // Displaying all students
                    sms.displayAllStudents();
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}

