package s04.Box;

/**
 * Description: WrapperClassCompare
 * Author: silence
 * Update: silence(2017-04-21 13:16)
 */
public class WrapperClassCompare {
    public static void main(String[] args)
    {
        Integer a = new Integer(6);
        //输出true
        System.out.println("6的包装类实例是否大于5.0" + (a > 5.0));

        //输出false
        System.out.println("比较2个包装类的实例是否相等："
                + (new Integer(2) == new Integer(2)));
        //通过自动装箱，允许把基本类型值赋值给包装类的实例
        Integer ina = 2;
        Integer inb = 2;
        //输出true
        System.out.println("两个2自动装箱后是否相等："
                + (ina == inb));
        Integer biga = 128;
        Integer bigb = 128;
        //输出false
        System.out.println("两个128自动装箱后是否相等："
                + (biga == bigb));
    }
}
