import java.util.*;

public class Random_numbers {
  public static void main(String[] args) {

    Random r = new Random();
    double random_number = r.nextInt(1000);
    System.out.println("random integer is:" + random_number);
  }
}
