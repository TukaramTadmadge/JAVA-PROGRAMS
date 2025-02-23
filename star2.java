import java.util.*;
class str
{
    Scanner sc=new Scanner(System.in);
    public void rightangle()
    {
        int i,j,n;
        System.out.println("entre the size of patetern");
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class star2
{
    public static void main(String[] args)
    {
        str r = new str();
        r.rightangle();
    }
}
