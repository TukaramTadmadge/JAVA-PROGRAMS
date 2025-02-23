import java.util.ArrayList;

class Arraylis {
  public static void main(String[] args) {
    ArrayList<String> Name = new ArrayList<String>();

    Name.add("Rahul");
    Name.add("satish");

    Name.add("karan");
    System.out.println(Name);

    Name.remove(1);
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