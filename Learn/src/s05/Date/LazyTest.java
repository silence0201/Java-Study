package s05.Date;

import java.util.Calendar;
import static java.util.Calendar.*;

/**
 * Description: LazyTest
 * Author: silence
 * Update: silence(2017-04-21 19:53)
 */
public class LazyTest {
    public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();
        cal.set(2003 , 7 , 31);  //2003-8-31
        // 将月份设为9，但9月31日不存在。
        // 如果立即修改，系统将会把cal自动调整到10月1日。
        cal.set(MONTH , 8);
        //下面代码输出10月1日
        //System.out.println(cal.getTime());    //①
        //设置DATE字段为5
        cal.set(DATE , 5);    //②
        System.out.println(cal.getTime());    //③
    }
}
