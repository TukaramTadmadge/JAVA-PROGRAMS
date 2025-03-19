import java.util.Scanner;

public class SwapNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int a = sc.nextInt();
    System.out.println("Enter the Second number:");
    int b = sc.nextInt();
    System.out.println("First number is:" + a);
    System.out.println("First number is:" + b);

    int temp;
    temp = a;
    a = b;
    b = temp;
    System.out.println("After swaping first number is:" + a);
    System.out.println("After swaping Second number is:" + b);

  }
}
