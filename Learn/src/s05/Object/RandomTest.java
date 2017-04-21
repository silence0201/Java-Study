package s05.Object;

import java.util.Arrays;
import java.util.Random;

/**
 * Description: RandomTest
 * Author: silence
 * Update: silence(2017-04-21 18:46)
 */
public class RandomTest {
    public static void main(String[] args)
    {
        Random rand = new Random();
        System.out.println("rand.nextBoolean()："
                + rand.nextBoolean());
        byte[] buffer = new byte[16];
        rand.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));
        //生成0.0~1.0之间的伪随机double数
        System.out.println("rand.nextDouble()："
                + rand.nextDouble());
        //生成0.0~1.0之间的伪随机float数
        System.out.println("rand.nextFloat()："
                + rand.nextFloat());
        //生成平均值是 0.0，标准差是 1.0的伪高斯数
        System.out.println("rand.nextGaussian()："
                + rand.nextGaussian());
        //生成一个处于int整数取值范围的伪随机整数
        System.out.println("rand.nextInt()：" + rand.nextInt());
        //生成0~26之间的伪随机整数
        System.out.println("rand.nextInt(26)：" + rand.nextInt(26));
        //生成一个处于long整数取值范围的伪随机整数
        System.out.println("rand.nextLong()：" +  rand.nextLong());
    }
}
