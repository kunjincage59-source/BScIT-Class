public class Student {

  private String name;
  private int rollNumber;
  private int[] marks;

  // Constructor
  public Student(String name, int rollNumber, int[] marks) {
    this.name = name;
    this.rollNumber = rollNumber;
    this.marks = marks;
  }

  // Getters
  public String getName() {
    return name;
  }

  public int getRollNumber() {
    return rollNumber;
  }

  // Calculate total marks
  public int calculateTotal() {
    int total = 0;

    for (int mark : marks) {
      total += mark;
    }

    return total;
  }

  // Calculate percentage
  public double calculatePercentage() {
    return calculateTotal() / (double) marks.length;
  }

  // Get grade
  public String getGrade() {
    return GradeCalculator.calculateGrade(calculatePercentage());
  }

  // Display student details
  public void displayDetails() {

    System.out.println("\n------ STUDENT DETAILS ------");

    System.out.println("Name: " + name);
    System.out.println("Roll Number: " + rollNumber);
    System.out.println("Total Marks: " + calculateTotal());
    System.out.println("Percentage: " + calculatePercentage() + "%");
    System.out.println("Grade: " + getGrade());

    System.out.println("-----------------------------");
  }
}