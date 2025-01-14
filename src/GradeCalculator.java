public class GradeCalculator {
  public static double calculateAverage(int[] grades) {
      int sum = 0;
      for (int grade : grades) {
          sum += grade;
      }
      return (double) sum / grades.length;
  }

  public static void main(String[] args) {
      int[] grades = {85, 90, 78, 92, 88};
      System.out.println("Average Grade: " + calculateAverage(grades));
  }
}
