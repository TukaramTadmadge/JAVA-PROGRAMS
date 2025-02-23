public class TwoDimensionalArray {
  public static void mainy(String[] args) {
    int arr[][] = {
        { 1, 2, 3 },
        { 2, 5, 6 },
        { 5, 6, 6 }
    };

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
