package s01.Operator;

/**
 * Description: MathTest
 * Author: silence
 * Update: silence(2017-04-20 16:24)
 */
public class MathTest {
    public static void main(String[] args) {
        //定义变量a为3.2
        double a = 3.2;
        //求a的5次方，并将计算结果赋为b。
        double b = Math.pow(a , 5);
        //输出b的值
        System.out.println(b);
        //求a的平方根，并将结果赋给c
        double c = Math.sqrt(a);
        //输出c的值
        System.out.println(c);
        //计算随机数,返回一个0～1之间的伪随机数。
        double d = Math.random();
        //输出随机数d的值
        System.out.println(d);
        //求1.57的sin函数值：1.57被当成弧度数
        double e = Math.sin(1.57);
        //输出接近1
        System.out.println(e);
    }
}
