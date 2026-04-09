package week05;

import java.util.Scanner;

public class LecturerMain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        LecturerData13 data = new LecturerData13(10); 
        int choice;

        do {
            System.out.println("\n=== LECTURER DATA MENU ===");
            System.out.println("1. Add Data");
            System.out.println("2. Display Data");
            System.out.println("3. Sort ASC (Youngest to Oldest - Bubble Sort)");
            System.out.println("4. Sort DSC (Oldest to Youngest - Selection Sort)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Gender (true for Male, false for Female): ");
                    boolean gender = sc.nextBoolean();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    data.add(new Lecturer13(id, name, gender, age));
                    System.out.println("Data added successfully!");
                    break;
                case 2:
                    System.out.println("\n--- Lecturer List ---");
                    data.print();
                    break;
                case 3:
                    data.sortingASC();
                    data.print();
                    break;
                case 4:
                    data.sortingDSC();
                    data.print();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        
        sc.close();
    }
}