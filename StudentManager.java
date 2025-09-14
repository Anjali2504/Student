import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    Student s = new Student(name, age, id);
                    students.add(s);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.println("\n--- Student List ---");
                    for (Student student : students) {
                        System.out.println(student);
                    }
                    break;

                case 3:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}

class Student {
    String name;
    int age;
    String lastname;
    int roll;

    Student(String name, int age, String lastname, int roll) {
        this.name = name;
        this.age = age;
        this.lastname = lastname;
        this.roll = roll;
    }

    public String toString() {
        return "Student ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}
