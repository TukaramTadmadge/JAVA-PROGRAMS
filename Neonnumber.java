import java.util.Scanner;

public class Neonnumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the NUmbeer To check Neon Or not:");
    int a = sc.nextInt();
    neon(a);
  }

  static void neon(int a) {
    int square = a * a;
    int sum = 0;
    while (square > 0) {
      int remainder = square % 10;
      sum = sum + remainder;
      square = square / 10;
    }

    if (sum == a) {
      System.out.println("number is neon");

    } else {
      System.out.println("NUmber is not Neon");
    }

  }

}
