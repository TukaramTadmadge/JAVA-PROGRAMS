class A {
  static int a;
  int b = 10;
  static String name;

  static void dispaly() {
    a = 20;
    System.out.println("a:" + a);

  }
}

class Exstatic {

  public static void main(String[] args) {
    A.a = 10;
    A obj = new A();
    A obj2 = new A();
    System.out.println("a:" + A.a);
    System.out.println("a:" + obj.a);

    System.out.println("a:" + obj2.a);
    obj.dispaly();
  }
}
