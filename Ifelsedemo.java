import java.util.*;

class Whiledemo {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your  age:");
    int age = sc.nextInt();
    if (age >= 18) {
      System.out.println("you  are eligible for  drive");

    } else {
      System.out.println("you can not eligible for driving any vechicle");
    }

  }
}