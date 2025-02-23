import java.util.Scanner;
import java.util.Arrays;

public class Array_Implementation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of the array:");
    int n = sc.nextInt();

    int arr[] = new int[n];

    System.out.println("Enter " + n + " elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Array elements: " + Arrays.toString(arr));
    System.out.println(arr[2]);

  }
}
