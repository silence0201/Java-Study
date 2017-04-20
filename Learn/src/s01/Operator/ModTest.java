package s01.Operator;

/**
 * Description: ModTest
 * Author: silence
 * Update: silence(2017-04-20 16:25)
 */
public class ModTest {
    public static void main(String[] args) {
        double a = 5.2;
        double b = 3.1;
        double mod = a % b;
        //mod的值为2.1
        System.out.println(mod);
        //输出非数:NaN
        System.out.println("5对0.0求余的结果是:" + 5 % 0.0);
        //输出非数:NaN
        System.out.println("-5.0对0求余的结果是:" + -5.0 % 0);
        //输出0
        System.out.println("0对5.0求余的结果是:" + 0 % 5.0);
        //输出非数:NaN
        System.out.println("0对0.0求余的结果是:" + 0 % 0.0);
        //下面代码将出现异常
        //java.lang.ArithmeticException: / by zero
        System.out.println("-5对0求余的结果是:" + -5 % 0);
    }
}
