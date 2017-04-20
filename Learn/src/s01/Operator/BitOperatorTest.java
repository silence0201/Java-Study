package s01.Operator;

/**
 * Description: BitOperatorTest
 * Author: silence
 * Update: silence(2017-04-20 16:22)
 */
public class BitOperatorTest {
    public static void main(String[] args) {
        //将输出1
        System.out.println(5 & 9);
        //将输出13
        System.out.println(5 | 9);
        //将输出4
        System.out.println(~-5);
        //将输出12
        System.out.println(5 ^ 9);
        //输出20
        System.out.println(5 << 2);
        //输出-20
        System.out.println(-5 << 2);
        //输出-2
        System.out.println(-5 >> 2);
        //输出1073741822
        System.out.println(-5 >>> 2);
    }
}
