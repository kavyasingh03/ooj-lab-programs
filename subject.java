import java.util.Scanner;

class PrintInfo {
    static void print() {
        System.out.println("Name: Kavya Singh");
        System.out.println("USN: 1BM23CS146");
    }
}

class Subject {
    int subjectMarks;
    int credits;
    int grade;
}

class Student {
    private static final int NUMBER_OF_SUBJECTS = 8;
    String name;
    String usn;
    double SGPA;
    Subject[] subjects;
    Scanner sc;

    Student(Scanner scanner) {
        subjects = new Subject[NUMBER_OF_SUBJECTS];
        for (int i = 0; i < NUMBER_OF_SUBJECTS; i++) {
            subjects[i] = new Subject();
        }
        this.sc = scanner;
    }

    void getStudentDetail() {
        System.out.println("Enter name and USN:");
        name = sc.next();
        usn = sc.next();
    }

    double getMarks() {
        System.out.println("Enter marks and credits of each subject:");
        double totalCredits = 0;
        double totalGradePoints = 0;

        for (int i = 0; i < NUMBER_OF_SUBJECTS; i++) {
            double marks = sc.nextDouble();
            double credits = sc.nextDouble();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                i--;
                continue;
            }

            if (marks == 100) {
                subjects[i].subjectMarks = 10;
            } else if (marks >= 90) {
                subjects[i].subjectMarks = 10;
            } else if (marks >= 80) {
                subjects[i].subjectMarks = 9;
            } else if (marks >= 70) {
                subjects[i].subjectMarks = 8;
            } else if (marks >= 60) {
                subjects[i].subjectMarks = 7;
            } else if (marks >= 50) {
                subjects[i].subjectMarks = 6;
            } else if (marks >= 40) {
                subjects[i].subjectMarks = 5;
            } else {
                subjects[i].subjectMarks = 0;
            }

            subjects[i].credits = (int) credits;  
            subjects[i].grade = subjects[i].credits * subjects[i].subjectMarks;
            totalCredits += subjects[i].credits;  
            totalGradePoints += subjects[i].grade;  
        }

        SGPA = totalGradePoints / totalCredits; 
        return totalCredits;  
    }

    void computeSGPA() {
        System.out.println("SGPA: " + SGPA);  
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nProcessing details for student " + (i + 1) + ":");
            Student student = new Student(sc);
            student.getStudentDetail();
            student.getMarks();
            student.computeSGPA();
        }
        PrintInfo.print();
        
        sc.close();
    }
}
