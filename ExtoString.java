class Student {
  int rollno;
  String name;

  Student() {
    rollno = 53;
    name = "Tukaram";
  }

  public String toString() {
    return "Roll number: " + rollno + "\t" + "Name: " + name;
  }
}

public class ExtoString {
  public static void main(String[] args) {
    Student obj = new Student();
    System.out.println(obj);
  }
}
