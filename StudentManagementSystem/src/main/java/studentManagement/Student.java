package studentManagement;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String studentID;
    private int gradeYear;
    private String courses = "";
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;
    
    public Student(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nEnter student first name : ");
        this.firstName = scan.nextLine();
        
        System.out.print("Enter student last name : ");
        this.lastName = scan.nextLine();
        
        System.out.println("---Select Student level---");
        System.out.print("1. Freshmen\n2. Sophomore\n3. Junior\n4. Senior\nEnter Student level: ");
        this.gradeYear = scan.nextInt();
        
        setStudentID();
    }
    
    public void setStudentID(){
        ++id;
        this.studentID = this.gradeYear + "" + id;
    }
    
    public void enroll(){
        while(true){
            System.out.print("Enter course to enroll (Q to quit) : ");
            Scanner scan = new Scanner(System.in);
            String course = scan.nextLine();
            if(course.equals("Q") || course.equals("q")){
                break;
            }
            this.courses += "\n  " + course; 
            this.tuitionBalance += this.costOfCourse;
        }
        System.out.print("---ENROLLED IN---");
        System.out.println(this.courses);
        System.out.println("-----------------");
        System.out.println("TUTION BALANCE: " + this.tuitionBalance);
    }
    
    public void viewBalance(){
        System.out.println("Your balance is: $" + this.tuitionBalance);
    }
    
    public void payTuition(){
        viewBalance();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your payment: $");
        int payment = scan.nextInt();
        this.tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    
    @Override
    public String toString(){
        return "Name: " + this.firstName + " " + this.lastName + 
                "\nGrade level: " + this.gradeYear +
                "\nStudent ID: " + this.studentID +
                "\nEnrolled Courses" + this.courses +
                "\nBalance: $" + this.tuitionBalance; 
    }
}
