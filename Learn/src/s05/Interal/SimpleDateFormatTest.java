package s05.Interal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description: SimpleDateFormatTest
 * Author: silence
 * Update: silence(2017-04-21 20:56)
 */
public class SimpleDateFormatTest {
    public static void main(String[] args)
            throws ParseException
    {
        Date d = new Date();
        //创建一个SimpleDateFormat对象
        SimpleDateFormat sdf1 = new SimpleDateFormat("Gyyyy年中第D天");
        //将d格式化成日期，输出：公元2007年中第354天
        String dateStr = sdf1.format(d);
        System.out.println(dateStr);
        //一个非常特殊的日期字符串
        String str = "07###三月##21";
        SimpleDateFormat sdf2 = new SimpleDateFormat("y###MMM##d");
        //将日期字符串解析成日期，输出：Wed Mar 21 00:00:00 CST 2007
        System.out.println(sdf2.parse(str));
    }
}
