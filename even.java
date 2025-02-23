import java.util.*;
public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the number");
        n = sc.nextInt();
        if(n%2==0)
        {
            System.out.println("given number is even");

        }
        else {
            System.out.println("given number is odd");
        }
    }
}
