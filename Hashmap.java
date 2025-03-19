import java.util.HashMap;
import java.util.Map;

public class Hashmap {
  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<>();

    map.put(53, "Tukaram");
    map.put(51, "Rahul");

    map.put(50, "sakshi");
    System.out.println(map);

    for (Map.Entry<Integer, String> e : map.entrySet())
      System.out.println("Key: " + e.getKey()
          + " Value: " + e.getValue());

  }

}
