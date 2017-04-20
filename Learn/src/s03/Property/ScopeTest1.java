package s03.Property;

/**
 * Description: ScopeTest1
 * Author: silence
 * Update: silence(2017-04-20 19:49)
 */
public class ScopeTest1 {
    //定义一个类成员变量作为循环变量
    static int i;
    public static void main(String[] args)
    {
        for ( i = 0 ; i < 10 ; i++)
        {
            System.out.println("Hello");
        }
    }
}
