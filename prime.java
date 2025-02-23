import java.util.Scanner;

public class prime {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number:");
    int a = sc.nextInt();

    if (a == 0 && a == 1) {
      System.out.println("Given number is prime");

    } else if (a > 1) {
      for (int i = 2; i < a; i++) {
        if (a % i == 0)

          System.out.println("number is not prime");

      }
    } else {
      System.out.println("number is prime");
    }

  }
}
