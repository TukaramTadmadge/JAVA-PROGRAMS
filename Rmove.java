import java.util.ArrayList;
import java.util.List;

class Remove {

  public static void main(String args[]) {

    List<String> al = new ArrayList<>();

    al.add("Tukaram");
    al.add("Dyp");

    al.add(1, "For");

    System.out.println("Initial ArrayList " + al);

    al.remove(1);

    System.out.println("After the Index Removal " + al);

    al.remove("Geeks");

    System.out.println("After the Object Removal " + al);
  }
}
