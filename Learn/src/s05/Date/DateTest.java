package s05.Date;

import java.util.Date;

/**
 * Description: DateTest
 * Author: silence
 * Update: silence(2017-04-21 19:28)
 */
public class DateTest {
    public static void main(String[] args)
    {
        Date d1 = new Date();
        //获取当前时间之后100ms的时间
        Date d2 = new Date(System.currentTimeMillis() + 100);
        System.out.println(d2);
        System.out.println(d1.compareTo(d2));
        System.out.println(d1.before(d2));
    }
}
