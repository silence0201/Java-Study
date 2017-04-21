package s04.Final;

/**
 * Description: PrivateFinalMethodTest
 * Author: silence
 * Update: silence(2017-04-21 14:16)
 */
public class PrivateFinalMethodTest
{
    private final void test(){}
}
class Sub extends PrivateFinalMethodTest
{
    //下面方法定义将不会出现问题
    public void test(){}
}
