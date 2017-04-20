package s03.Method;

/**
 * Description: Overload
 * Author: silence
 * Update: silence(2017-04-20 19:23)
 */
public class Overload {
    //下面定义了两个test方法，但方法的形参列表不同
    //系统可以区分这两个方法，这种被称为方法重载
    public void test()
    {
        System.out.println("无参数");
    }
    public void test(String msg)
    {
        System.out.println("重载的test方法 " + msg);
    }
    public static void main(String[] args)
    {
        Overload ol = new Overload();
        //调用test时没有传入参数，因此系统调用上面没有参数的test方法。
        ol.test();
        //调用test时传入了一个字符串参数，
        //因此系统调用上面有一个字符串参数的test方法。
        ol.test("hello");
    }

}