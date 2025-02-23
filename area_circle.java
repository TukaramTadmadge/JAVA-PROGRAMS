import java.util.*;

class area_circle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("enter the radius of circle:");
    int r = sc.nextInt();
    double area;
    area = 3.14 * r * r;
    System.out.println(area);
  }
}