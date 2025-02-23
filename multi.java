 class A {
    public void show()
    {
        System.out.println("this is super class ");

    }

}
 class B extends A
{
    public void show1()
    {
        System.out.println("this is intermediate class ");

    }

}
 class C extends B
{
    public void dis()
    {
        System.out.println("this is base class ");

    }

}

class multi
{
    public static void main(String[] args) {
        C r=new C();
        r.show();
        r.show1();
        r.dis();
    }
}