public class Test
{
    public void fun(Integer i)
    {
        System.out.println("fun(Integer ) ");
    }
    public void fun(String name)
    {
        System.out.println("fun(String ) ");
    }
    public static void main(String [] args)
    {
        Test mv= new Test();
        Integer arg=null;
mv.fun(arg);
    }
}
