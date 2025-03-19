import java.util.Scanner;

public class Vowels {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a single alphabet: ");
    char ch = sc.next().toLowerCase().charAt(0);

    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
      System.out.println(ch + " is a vowel.");
    } else if ((ch >= 'a' && ch <= 'z')) {
      System.out.println(ch + " is a consonant.");
    } else {
      System.out.println(ch + " is not a valid alphabet character.");
    }
  }
}
