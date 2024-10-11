package ie.atu.week4;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        // Prompt user for 3 students info
        String[] details1 = getAllDetails();
        String[] details2 = getAllDetails();
        String[] details3 = getAllDetails();

        // Creating 3 students, while only initializing info for stu2 and stu3
        Student student = new Student();
        Student student2 = new Student(details2[0]);
        Student student3 = new Student(details3[0], details3[1], details3[2]);

        // Setting first student info using elements of array
        student.setName(details1[0]);
        student.setEmail(details1[1]);
        student.setCourse(details1[2]);
        // Setting email and course for student 2
        student2.setEmail(details2[1]);
        student2.setCourse(details2[2]);

        // Call method to print students details using getter methods
        printInfo(student, student2, student3);
    }

    // Method to take in student details and store in arrays
    public static String[] getAllDetails(){
        Scanner sc = new Scanner(System.in);
        String[] details = new String[3];
        System.out.println("Enter the name of the student");
        details[0] = sc.nextLine();
        System.out.println("Enter the email of the student");
        details[1] = sc.nextLine();
        System.out.println("Enter the course of the student");
        details[2] = sc.nextLine();
        return details;
    }

    public static void printInfo(Student student, Student student2, Student student3) {
        System.out.println("Student 1: Name = " + student.getName() + ", Email = " + student.getEmail() + ", Course = " + student.getCourse());
        System.out.println("Student 2: Name = " + student2.getName() + ", Email = " + student2.getEmail() + ", Course = " + student2.getCourse());
        System.out.println("Student 3: Name = " + student3.getName() + ", Email = " + student3.getEmail() + ", Course = " + student3.getCourse());
    }
}