import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

  public static void main(String[] args) {
    HashSet<String> hs = new HashSet<>();
    hs.add("Dyp");
    hs.add("kolhapur ");

    hs.add("Kasaba bawada");

    System.out.println(hs);
    hs.remove("Dyp");
    if (hs.contains("kolhapur"))
      ;
    {
      System.out.println("Elemrnt find in hashset ");
    }
    if (!hs.contains("kolhapur")) {
      System.out.println("Not found");
    }
    System.out.println(hs);

    for (String str : hs) {
      System.out.println(str);
    }

  }
}
