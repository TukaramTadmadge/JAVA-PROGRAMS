import java.util.*;
class st
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
class star1
{
    public static void main(String[] args)
    {
        st r = new st();
        r.rightangle();
    }
}
