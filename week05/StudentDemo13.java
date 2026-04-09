package week05;
import java.util.Scanner;
public class StudentDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int size = sc.nextInt();
        sc.nextLine(); 
        TopStudents13 topStudents = new TopStudents13(size);

        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter data for student " + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Class: ");
            String studentClass = sc.nextLine();
            System.out.print("GPA: ");
            double gpa = sc.nextDouble();
            sc.nextLine(); 

            topStudents.add(new Student13(nim, name, studentClass, gpa));
        }

        System.out.println("\nOriginal student list:");
        topStudents.print();

        System.out.println("\nSorted student list (by GPA, descending) using Bubble Sort:");
        topStudents.bubbleSort();
        topStudents.print();
        
        sc.close();
    }
}