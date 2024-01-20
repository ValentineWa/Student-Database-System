package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1001;

    //Constructor: prompt user to enter students names and year
public Student () {
    Scanner in = new Scanner (System.in);
    System.out.println("Enter student first name: ");
    this.firstName = in.nextLine();

    System.out.println("Enter student last name: ");
    this.lastName = in.nextLine();

    System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
    this.gradeYear = in.nextInt();

    setStudentID();
//    System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);




}
    //Generate and ID
 private void setStudentID(){
    //grade level +ID
     id++;
     this.studentID = gradeYear + "" + id;
}
    //Enroll in courses
public void enroll(){
    //Get inside a loop, user hits 0
   do {
        System.out.println("Enter course to enroll (Q to quit): ");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();
        if (!course.equals("Q")) {
            courses = courses + "\n " + course;
            tuitionBalance = tuitionBalance + costOfCourse;
        }
        else {
            break;
        }
    } while (1 != 0);
    System.out.println("Enrolled in: " + courses);
    System.out.println("Tuition balance: " + tuitionBalance);
}
    //View balance
public void viewBalance(){
    System.out.println("Your balance is: Ksh " + tuitionBalance);

}
    //Pay tuition
public void payTuition(){
    viewBalance();
    System.out.println("Enter your payment amount: Ksh");
    Scanner in = new Scanner(System.in);
    int payment = in.nextInt();
    tuitionBalance = tuitionBalance - payment; //we're assuming the payments will always be less than the tuition
    System.out.println("Thank you for your payment of : Ksh: " + payment);
    viewBalance();
}
    //Show status
public String toString(){
    return "Name: " + firstName + " " + lastName +
            "\nGradeLevel: " + gradeYear +
            "\nStudent ID: " + studentID +
            "\nCourses Enrolled:" + courses +
            "\nBalance: Ksh" + tuitionBalance;
}

}
