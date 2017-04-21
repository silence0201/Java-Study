package s04.Static;

/**
 * Description: NullAccessStatic
 * Author: silence
 * Update: silence(2017-04-21 13:40)
 */
public class NullAccessStatic
{
    private static void test()
    {
        System.out.println("static修饰的类方法");
    }
    public static void main(String[] args)
    {
        //定义一个NullAccessStatic变量，其值为null
        NullAccessStatic nas = null;
        //null对象调用所属类的静态方法
        nas.test();
    }
}
