package s03.Method;

/**
 * Description: OverloadVarargs
 * Author: silence
 * Update: silence(2017-04-20 19:17)
 */
public class OverloadVarargs {

    public void test(String msg)
    {
        System.out.println("只有一个字符串参数的test方法 ");
    }
    //因为前面已经有了一个test方法，test方法里有一个字符串参数。
    //此处的长度可变形参里不包含一个字符串参数的形式
    public void test(String... books)
    {
        System.out.println("****形参长度可变的test方法****");
    }
    public static void main(String[] args)
    {
        OverloadVarargs olv = new OverloadVarargs();
        //下面两次调用将执行第二个test方法
        olv.test();
        olv.test("aa" , "bb");
        //下面将执行第一个test方法
        olv.test("aa");
        //下面调用将执行第二个test方法
        olv.test(new String[]{"aa"});
    }
}
