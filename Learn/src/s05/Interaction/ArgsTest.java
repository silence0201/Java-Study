package s05.Interaction;

/**
 * Description: ArgsTest
 * Author: silence
 * Update: silence(2017-04-21 17:55)
 */
public class ArgsTest {
    public static void main(String[] args)
    {
        //输出args数组的长度
        System.out.println(args.length);
        //遍历args数组的每个元素
        for (String arg : args)
        {
            System.out.println(arg);
        }
    }
}
