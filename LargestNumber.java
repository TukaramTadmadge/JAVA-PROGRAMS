import java.util.Scanner;

public class LargestNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three Numbers:");
    int a = sc.nextInt();
    int b = sc.nextInt();

    int c = sc.nextInt();
    if (a > b && a > c) {
      System.out.println("largest numbe is:" + a);

    } else if (b > b && b > c) {
      System.out.println("largest numbe is:" + b);
    } else {
      System.out.println("largest numbe is:" + c);
    }
  }
}
