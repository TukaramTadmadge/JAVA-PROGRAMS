import java.util.ArrayList;

public class AL {
  public static void main(String[] args) {

    ArrayList<String> al = new ArrayList<>();

    al.add("Apple");
    al.add("Banana");
    al.add("Apple"); // Duplicates are allowed

    System.out.println(al);
  }
}
