package s05.System;

/**
 * Description: IdentityHashCodeTest
 * Author: silence
 * Update: silence(2017-04-21 18:21)
 */
public class IdentityHashCodeTest {
    public static void main(String[] args)
    {
        //下面程序中s1和s2是两个不同对象
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        //String重写了hashCode方法——改为根据字符序列计算hashCode值，
        //因为s1和s2的字符序列相同，所以它们的hashCode方法返回值相同
        System.out.println(s1.hashCode()
                + "----" + s2.hashCode());
        //s1和s2是不同的字符串对象，所以它们的identityHashCode值不同
        System.out.println(System.identityHashCode(s1)
                + "----" + System.identityHashCode(s2));
        String s3 = "Java";
        String s4 = "Java";
        //s3和s4是相同的字符串对象，所以它们的identityHashCode值相同
        System.out.println(System.identityHashCode(s3)
                + "----" + System.identityHashCode(s4));
    }
}
