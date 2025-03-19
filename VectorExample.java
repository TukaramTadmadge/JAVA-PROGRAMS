import java.util.Vector;

public class VectorExample {
  public static void main(String[] args) {
    Vector<String> al = new Vector<>();
    al.addFirst("Tukaram");
    al.addLast("Balaji");

    al.add("Tadmadge");
    al.add(0, "name");
    System.out.println(al);
    System.out.println(al.get(1));
    al.set(3, "Reddy");
    System.out.println(al);
    System.out.println(al.contains("tukaram"));
    System.out.println(al);
    System.out.println(al.isEmpty());
    System.out.println(al);
    al.clear();
    System.out.println(al);

  }
}
