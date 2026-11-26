import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    StudentManager manager = new StudentManager();

    int choice;

    do {

      System.out.println("\n===== STUDENT GRADE MANAGEMENT SYSTEM =====");

      System.out.println("1. Add Student");
      System.out.println("2. View All Students");
      System.out.println("3. Search Student");
      System.out.println("4. Exit");

      System.out.print("Enter your choice: ");

      choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {

        case 1:

          System.out.print("Enter Student Name: ");
          String name = sc.nextLine();

          System.out.print("Enter Roll Number: ");
          int roll = sc.nextInt();

          int[] marks = new int[5];

          String[] subjects = {
              "Java", "DBMS", "Computer Networks",
              "Operating Systems", "Mathematics"
          };

          for (int i = 0; i < 5; i++) {

            do {
              System.out.print("Enter marks in " + subjects[i] + " (0-100): ");
              marks[i] = sc.nextInt();

              if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Enter between 0 and 100.");
              }

            } while (marks[i] < 0 || marks[i] > 100);
          }

          Student student = new Student(name, roll, marks);

          manager.addStudent(student);

          break;

        case 2:

          manager.displayAllStudents();

          break;

        case 3:

          System.out.print("Enter Roll Number: ");
          int searchRoll = sc.nextInt();

          Student found = manager.searchStudent(searchRoll);

          if (found != null) {
            found.displayDetails();
          } else {
            System.out.println("Student not found!");
          }

          break;

        case 4:

          System.out.println("Thank you for using the system!");

          break;

        default:

          System.out.println("Invalid choice! Try again.");
      }

    } while (choice != 4);

    sc.close();
  }
}