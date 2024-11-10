/**
  2) Create a Java class called Student with the following details as private
 instance variables within it.
 USN
 Name
 Branch
 PhoneNo.
 Write a Java program to create ‘n’ number student objects and print the
 USN, name, branch, and phone number of these objects with suitable
 headings.
 **/
package Q2;

import java.util.Scanner;

class Student {
    // Private instance variables
    private String USN;
    private String name;
    private String branch;
    private String phoneNo;

    // Constructor to initialize student details
    public Student(String USN, String name, String branch, String phoneNo) {
        this.USN = USN;
        this.name = name;
        this.branch = branch;
        this.phoneNo = phoneNo;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.printf("%-15s %-20s %-10s %-15s%n", USN, name, branch, phoneNo);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        // Create an array of Student objects
        Student[] students = new Student[n];

        // Loop to collect details for each student
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("USN: ");
            String USN = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Branch: ");
            String branch = scanner.nextLine();
            System.out.print("Phone No: ");
            String phoneNo = scanner.nextLine();

            // Create a new Student object with the entered details
            students[i] = new Student(USN, name, branch, phoneNo);
        }

        // Display the details of all students
        System.out.printf("%-15s %-20s %-10s %-15s%n", "USN", "Name", "Branch", "Phone No");
        System.out.println("--------------------------------------------------------------");
        for (Student student : students) {
            student.displayStudentDetails();
        }
    }
}
