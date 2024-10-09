package ie.atu.week4;
import java.util.Scanner;
public class StudentApp {
    public static void main(String[] args) {

        //prompt for 3 students info
        String[] details1 = getAllDetails();
        String[] details2 = getAllDetails();
        String[] details3 = getAllDetails();

        // creating 3 students
        Student student = new Student();
        Student student2 = new Student(details2[0]);
        Student student3 = new Student(details3[0], details3[1], details3[2]);

        // setting first student info using elements of array
        student.setName(details1[0]);
        student.setEmail(details1[1]);
        student.setCourse(details1[2]);
        // second student info using elements of array
        student2.setName(details2[0]);
        student2.setEmail(details2[1]);
        student2.setCourse(details2[2]);
        // third student info using elements of array
        student3.setName(details3[0]);
        student3.setEmail(details3[1]);
        student3.setCourse(details3[2]);
        // print students
        System.out.println("\nStudent 1: " + student + "\nStudent 2: " + student2 + "\nStudent 3: " + student3);
        System.out.println("\n");
    }

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