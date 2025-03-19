import java.util.Scanner;

public class ArmstrongRange {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Give me range of numbers to find the Armstrong numbers:");
    int a = sc.nextInt();
    int b = sc.nextInt();

    findArmstrong(a, b);

    sc.close();
  }

  static void findArmstrong(int a, int b) {
    for (int i = a; i <= b; i++) {
      if (isArmstrong(i)) {
        System.out.println(i);
      }
    }
  }

  static boolean isArmstrong(int num) {
    int sum = 0, originalNum = num;
    int digits = countDigits(num);

    while (num > 0) {
      int remainder = num % 10;
      sum += Math.pow(remainder, digits);
      num /= 10;
    }

    return sum == originalNum;
  }

  static int countDigits(int num) {
    int count = 0;
    while (num > 0) {
      count++;
      num /= 10;
    }
    return count;
  }
}
