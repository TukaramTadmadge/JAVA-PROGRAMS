import java.util.Scanner;

class LeapYear {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a year to check if it is a leap year:");
    int year = sc.nextInt();

    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
      System.out.println(year + " is a Leap Year.");
    } else {
      System.out.println(year + " is NOT a Leap Year.");
    }
  }
}
