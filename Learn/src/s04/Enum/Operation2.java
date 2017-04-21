package s04.Enum;

/**
 * Description: Operation2
 * Author: silence
 * Update: silence(2017-04-21 17:00)
 */
public enum Operation2
{
    PLUS
            {
                public double eval(double x , double y)
                {
                    return x + y;
                }
            },
    MINUS
            {
                public double eval(double x , double y)
                {
                    return x - y;
                }
            },
    TIMES
            {
                public double eval(double x , double y)
                {
                    return x * y;
                }
            },
    DIVIDE
            {
                public double eval(double x , double y)
                {
                    return x / y;
                }
            };
    //为枚举类定义一个抽象方法，
    //这个抽象方法由不同枚举值提供不同的实现
    public abstract double eval(double x, double y);
    public static void main(String[] args)
    {
        System.out.println(Operation2.PLUS.eval(3, 4));
        System.out.println(Operation2.MINUS.eval(5, 4));
        System.out.println(Operation2.TIMES.eval(5, 4));
        System.out.println(Operation2.DIVIDE.eval(5, 4));
    }
}

