import java.util.Scanner;

public class PrimeNumbersBetween {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int a = sc.nextInt();
    System.out.print("Enter the second number: ");
    int b = sc.nextInt();
    sc.close();

    if (a > b) {
      int temp = a;
      a = b;
      b = temp;
    }

    System.out.println("Prime numbers between " + a + " and " + b + " are:");
    for (int i = a; i <= b; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }

  public static boolean isPrime(int num) {
    if (num < 2)
      return false;
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0)
        return false;
    }
    return true;
  }
}
