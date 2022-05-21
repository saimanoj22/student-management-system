package studentManagement;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter number of students to enroll: ");
        int numOfStudents = scan.nextInt();
        Student[] students = new Student[numOfStudents];
        
        for(int i = 0; i < numOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }
        
        System.out.println("\n=========STUDENT DETAILS=========");
        for(int i = 0; i < numOfStudents; i++){
            System.out.println(students[i].toString());
            System.out.println("=================================");
        }
    }
}
