import java.util.*;

class factorial {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int fact = 1;
    System.out.println("Enter the number to calculate the factorial:");
    int n = sc.nextInt();

    if (n == 1 || n == 0) {
      System.out.println("factorial 1");
      return;
    } else {

      for (int i = 2; i <= n; i++)
        fact = fact * i;

    }
    System.out.println("factorial is:" + fact);

  }

}