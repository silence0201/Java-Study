package s04.Finalize;

/**
 * Description: StatusTranfer
 * Author: silence
 * Update: silence(2017-04-21 17:10)
 */
public class StatusTranfer {
    public static void test()
    {
        String a = new String("轻量级Java EE企业应用实战"); //①
        a = new String("疯狂Java讲义");   //②
    }
    public static void main(String[] args)
    {
        test();     //③
    }
}
