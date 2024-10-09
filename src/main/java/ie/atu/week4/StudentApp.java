package ie.atu.week4;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        // creating 3 students
        Student student = new Student();
        Student student2 = new Student("keith");
        Student student3 = new Student("nancy", "nancy@gmail.com", "Science");

        // two arrays to hold info for first two students
        String[] details1 = getAllDetails();
        String[] details2 = getSomeDetails();
        // setting first student info using elements of array
        student.setName(details1[0]);
        student.setEmail(details1[1]);
        student.setCourse(details1[2]);
        // second student info using elements of array
        student2.setEmail(details2[1]);
        student2.setCourse(details2[2]);
        // print students
        System.out.println("\n" + student.toString() + "\n" + student2.toString() + "\n" + student3.toString());
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

    public static String[] getSomeDetails(){
        Scanner sc = new Scanner(System.in);
        String[] details = new String[3];
        System.out.println("Enter the email of the student");
        details[1] = sc.nextLine();
        System.out.println("Enter the course of the student");
        details[2] = sc.nextLine();
        return details;
    }
}
