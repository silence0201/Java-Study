package s02.Control;

/**
 * Description: ContinueTest2
 * Author: silence
 * Update: silence(2017-04-20 16:56)
 */
public class ContinueTest2 {
    public static void main(String[] args)
    {
        //外层循环
        outer:
        for (int i = 0 ; i < 5 ; i++ )
        {
            //内层循环
            for (int j = 0; j < 3 ; j++ )
            {
                System.out.println("i的值为:" + i + "  j的值为:" + j);
                if (j == 1)
                {
                    //跳出outer标签所指定的循环。
                    continue outer;
                }
            }
        }
    }
}
