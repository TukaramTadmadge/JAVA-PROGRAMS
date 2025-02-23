
import java.util.*;
class one {
    public void show() {
        int a, b;
        System.out.println("enter the two numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int d = a + b;
        System.out.println(+d);
    }
}
class two extends one
{
   public void dis() {

       System.out.println("this is sub class of singal inheritance");
    }
}
class singal
{
    public static void main(String[] args) {
        two r=new two();
        r.show();
        r.dis();
    }
}