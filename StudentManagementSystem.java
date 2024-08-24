package management;

import java.util.ArrayList;
import java.util.List;


public class StudentManagementSystem {
    private List<Student> students;

    // Constructor
    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // Method to remove a student by roll number
    public void removeStudent(int rollNumber) {
        students.removeIf(student -> student.getRollNumber() == rollNumber);
        System.out.println("Student removed successfully!");
    }

    // Method to search for a student by roll number
    public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    // Method to display all students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
