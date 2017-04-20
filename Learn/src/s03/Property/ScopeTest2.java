package s03.Property;

/**
 * Description: ScopeTest2
 * Author: silence
 * Update: silence(2017-04-20 19:50)
 */
public class ScopeTest2 {
    public static void main(String[] args)
    {
        //定义一个方法局部变量作为循环变量
        int i;
        for ( i = 0 ; i < 10 ; i++)
        {
            System.out.println("Hello");
        }
    }
}
