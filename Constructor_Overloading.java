class Area {

  Area(double radius) {
    System.out.println("Area of Circle is:" + (3.14 * radius * radius));
  }

  Area(double base, double height) {
    System.out.println("Area of triangle is :" + (0.5 * base * height));
  }

}

class Constructor_Overloading {
  public static void main(String[] args) {
    new Area(10);
    new Area(10, 20);
  }
}
