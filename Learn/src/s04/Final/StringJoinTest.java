package s04.Final;

/**
 * Description: StringJoinTest
 * Author: silence
 * Update: silence(2017-04-21 14:14)
 */
public class StringJoinTest {
    public static void main(String[] args)
    {
        String s1 = "疯狂Java";
        //s2变量引用的字符串可以编译时就确定出来，
        //因此引用常量池中已有的"疯狂Java"字符串
        String s2 = "疯狂" + "Java";
        System.out.println(s1 == s2);
        //定义2个字符串直接量
        String str1 = "疯狂";     //①
        String str2 = "Java";     //②
        //将str1和str2进行连接运算
        String s3 = str1 + str2;
        System.out.println(s1 == s3);
    }
}
