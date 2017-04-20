package s02.Control;

/**
 * Description: ContinueTest
 * Author: silence
 * Update: silence(2017-04-20 16:55)
 */
public class ContinueTest {
    public static void main(String[] args)
    {
        //一个简单的for循环
        for (int i = 0; i < 3 ; i++ )
        {
            System.out.println("i的值是" + i);
            if (i == 1)
            {
                //略过本次循环的剩下语句
                continue;
            }
            System.out.println("continue后的输出语句");
        }
    }
}
