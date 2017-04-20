package s03.Property;

/**
 * Description: ScopeTest3
 * Author: silence
 * Update: silence(2017-04-20 19:51)
 */
public class ScopeTest3 {
    public static void main(String[] args)
    {
        //定义一个代码块局部变量作为循环变量
        for (int i = 0 ; i < 10 ; i++)
        {
            System.out.println("Hello");
        }
    }
}
