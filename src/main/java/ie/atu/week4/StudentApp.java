package ie.atu.week4;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        //prompt for 3 students info
        String[] details1 = getAllDetails();
        String[] details2 = getAllDetails();
        String[] details3 = getAllDetails();

        // creating 3 students, NOW STEPS INTO THE PROPER CONSTRUCTORS
        Student student = new Student();
        Student student2 = new Student(details2[0]);
        Student student3 = new Student(details3[0], details3[1], details3[2]);

        // setting first student info using elements of array
        student.setName(details1[0]);
        student.setEmail(details1[1]);
        student.setCourse(details1[2]);

        // set email and course for student 2
        student2.setEmail(details2[1]);
        student2.setCourse(details2[2]);

        // print students details
        System.out.println("Student 1: Name = " + student.getName() + ", Email = " + student.getEmail() + ", Course = " + student.getCourse());
        System.out.println("Student 2: Name = " + student2.getName() + ", Email = " + student2.getEmail() + ", Course = " + student2.getCourse());
        System.out.println("Student 3: Name = " + student3.getName() + ", Email = " + student3.getEmail() + ", Course = " + student3.getCourse());
    }

    // method to take in all student details and store in array
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
}