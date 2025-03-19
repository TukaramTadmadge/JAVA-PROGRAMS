
import java.util.Scanner;

public class Fibonnacii {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entert the size of fibonnaci series:");
    int n = sc.nextInt();
    int firstNum = 0;
    int SecondNum = 1;
    int NextNum;
    for (int i = 1; i < n; i++) {
      System.out.print(firstNum + " ");
      NextNum = firstNum + SecondNum;
      firstNum = SecondNum;
      SecondNum = NextNum;
    }
  }

}
