package s03.Property;

/**
 * Description: MethodLocalVariableTest
 * Author: silence
 * Update: silence(2017-04-20 19:49)
 */
public class MethodLocalVariableTest {
    public static void main(String[] args)
    {
        //定义一个方法局部变量a
        int a;
        //下面代码将出现错误，因为a变量还未初始化
        //System.out.println("方法局部变量a的值：" + a);
        //为a变量赋初始值，也就是进行初始化
        a = 5;
        System.out.println("方法局部变量a的值：" + a);
    }
}
