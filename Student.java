package management;

public class Student {
    private String name;
    private int rollNumber;
    private String grade;
    private String email; // Additional attribute

    // Constructor
    public Student(String name, int rollNumber, String grade, String email) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.email = email;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getRollNumber() { return rollNumber; }
    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // toString method to display student details
    @Override
    public String toString() {
        return "Student{" +
                "Name='" + name + '\'' +
                ", Roll Number=" + rollNumber +
                ", Grade='" + grade + '\'' +
                ", Email='" + email + '\'' +
                '}';
    }
}
