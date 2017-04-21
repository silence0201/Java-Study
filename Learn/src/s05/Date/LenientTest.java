package s05.Date;

import java.util.Calendar;
import static java.util.Calendar.*;
/**
 * Description: LenientTest
 * Author: silence
 * Update: silence(2017-04-21 19:48)
 */
public class LenientTest {
    public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();
        //结果是YEAR字段加1，MONTH字段为1（二月）
        cal.set(MONTH , 13);   //①
        System.out.println(cal.getTime());
        //关闭容错性
        cal.setLenient(false);
        //导致运行时异常
        cal.set(MONTH , 13);   //②
        System.out.println(cal.getTime());
    }
}
