class Area {
  // Parameterized constructor
  public Area(int base, int height) {
    System.out.println("Area of triangle is: " + 0.5 * base * height);
  }

  public class ParamaterizedConstructor {
    public static void main(String[] args) {
      Area obj = new Area(10, 20);
    }
  }
}