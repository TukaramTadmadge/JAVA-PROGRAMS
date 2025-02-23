import java.util.Scanner;

class area {

  Scanner sc = new Scanner(System.in);

  area() {
    System.out.println("Enter the radius of circle for calculation area of circle");
    double radius = sc.nextInt();
    double area = 3.14 * radius * radius;
    System.out.println("Area is :" + area);
  }
}

public class Constructor {

  public static void main(String[] args) {
    area obj = new area();

  }
}
