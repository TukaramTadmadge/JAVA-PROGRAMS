public class evencountString {
  public static void main(String[] args) {

    String str = "i am here to complete my BE degree";
    for (String s : str.split(" ")) {

      if (s.length() % 2 == 0) {
        System.out.println(s);
      }
    }
  }
}
