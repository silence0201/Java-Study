package s03.Method;

/**
 * Description: Recursive
 * Author: silence
 * Update: silence(2017-04-20 19:16)
 */
public class Recursive {
    public static int fn(int n)
    {
        if (n == 0)
        {
            return 1;
        }
        else if (n == 1)
        {
            return 4;
        }
        else
        {
            //方法中调用它自身，就是方法递归
            return 2 * fn(n - 1) + fn(n - 2);
        }
    }
    public static void main(String[] args)
    {
        //输出fn(10)的结果
        System.out.println(fn(10));
    }
}
