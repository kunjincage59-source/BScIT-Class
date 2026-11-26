import java.util.ArrayList;

public class StudentManager {

  private ArrayList<Student> students = new ArrayList<>();

  // Add student
  public void addStudent(Student student) {

    if (searchStudent(student.getRollNumber()) != null) {
      System.out.println("Roll number already exists!");
      return;
    }

    students.add(student);

    System.out.println("Student added successfully!");
  }

  // Search student
  public Student searchStudent(int rollNumber) {

    for (Student student : students) {

      if (student.getRollNumber() == rollNumber) {
        return student;
      }
    }

    return null;
  }

  // Display all students
  public void displayAllStudents() {

    if (students.isEmpty()) {
      System.out.println("No student records found!");
      return;
    }

    for (Student student : students) {
      student.displayDetails();
    }
  }
}