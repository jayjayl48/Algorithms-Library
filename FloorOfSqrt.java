import java.util.Scanner;

public class FloorOfSqrt {
  public static void main(String[] args) {
    boolean run = true;

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the floorOfSqrt Program\n");

    while (run) {
      System.out.println("Please enter a positive integer or enter 0 to halt");
      int n = input.nextInt();

      if (n > 0) {
        System.out.println("The answer is " + floorOfSqrt(n) + "\n");

      }

      else if (n == 0) {
        System.out.println("\nThank you for using the program. Goodbye");
        break;

      }

      else {
        System.out.println("Please enter a positive intger");
      }
    }
  }

  public static int floorOfSqrt(int n) {

    double nSqrt = Math.sqrt(n);
    int answer = (int) Math.floor(nSqrt);

    return answer;
  }
}
