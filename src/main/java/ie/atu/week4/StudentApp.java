package ie.atu.week4;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for number of students to add
        System.out.println("How many students do you want to enroll?");
        int numOfStudents = sc.nextInt();
        Student[] students = new Student[numOfStudents];

        // Get details of each student, store new student in array and set details in separate array
        for (int n = 0; n < numOfStudents; n++) {
            System.out.println("Enter student " + (n + 1) + " details: ");
            String[] details = getAllDetails();
            students[n] = new Student(details[0], details[1], details[2]);
        }

        // Print details for num of students
        for (int n = 0; n < numOfStudents; n++) {
            System.out.println("Student " + (n + 1) + " " + students[n]);
        }
    }

    // Method to take in student details and store in array elements
    public static String[] getAllDetails(){
        Scanner sc = new Scanner(System.in);
        String[] details = new String[3];
        System.out.println("Enter the name of the student ");
        details[0] = sc.nextLine();
        System.out.println("Enter the email of the student");
        details[1] = sc.nextLine();
        System.out.println("Enter the course of the student");
        details[2] = sc.nextLine();
        return details;
    }
}