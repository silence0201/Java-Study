package s02.Control;

/**
 * Description: BreakTest
 * Author: silence
 * Update: silence(2017-04-20 16:51)
 */
public class BreakTest {
    public static void main(String[] args)
    {
        //一个简单的for循环
        for (int i = 0; i < 10 ; i++ )
        {
            System.out.println("i的值是" + i);
            if (i == 2)
            {
                //执行该语句时将结束循环
                break;
            }
        }
    }
}
