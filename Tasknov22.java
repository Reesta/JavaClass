import java.util.*;
public class Tasknov22 {
    public static void main(String[] args) {
        // Write a Java program that collects the details of a single student. The
        // program should use a while loop to ensure the user provides valid input for
        // all fields. The student details should include:
        // 1. Name
        // 2. Age
        // 3. Gender (must be “Male”, “Female”, or “Other”)
        // 4. Grade (a letter between A and F, inclusive)
        // 5. Address
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        while (name.isEmpty()) {
            System.out.println("Invalid input. Please enter your name.");
            name = in.nextLine();
        }
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        while (!(age >= 5 && age <= 120)) {
            System.out.println("Invalid input. Please enter a valid age");
            age = in.nextInt();
        }
        in.nextLine();
        System.out.print("Enter your gender:");
        String gender = in.nextLine();
        while (!gender.equals("Male") && !gender.equals("Female") && !gender.equals("Other")) {
            System.out.println("Invalid input. Please enter Male, Female, or Other");
            gender = in.nextLine();
        }
        System.out.print("Enter your grade (A-F): ");
        String grade = in.nextLine();
        while (!grade.equals("A") && !grade.equals("B") && !grade.equals("C") && !grade.equals("D")
                && !grade.equals("E") && !grade.equals("F")) {
            System.out.println("Invalid input. Please enter A, B, C, D, E,or F");
            grade = in.nextLine();
        }
        System.out.print("Enter your address: ");
        String address = in.nextLine();
        while (address.isEmpty()) {
            System.out.println("Invalid input. Please enter your address.");
            address = in.nextLine();
        }
        System.out.println("\n*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        System.out.println("Student Details:");
        System.out.printf(
                "Student Name: %s\nStudent Age: %d \nStudent Gender: %s\nStudent Grade: %s\nStudent Address: %s\n",
                name, age, gender, grade, address);
        in.close();
    }
}




