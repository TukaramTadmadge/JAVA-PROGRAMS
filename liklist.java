import java.util.LinkedList;

public class liklist {

  class Arraylis {
    public static void main(String[] args) {
      LinkedList<String> Name = new LinkedList<String>();

      Name.add("Rahul");
      Name.add("satish");

      Name.addFirst("karan");
      Name.addLast("karan");

      System.out.println(Name);

      Name.removeFirst();
      System.out.println(Name);
      Name.set(0, "tukaram");
      System.out.println(Name);
      String[] arr = Name.toArray(new String[0]);
      Name.add(1, "jay");
      System.out.println(Name);
      System.out.println(Name.get(2));

      System.out.println(Name);
      Name.clear();
    }

  }

}
