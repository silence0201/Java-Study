package s03.Block;

/**
 * Description: InstanceInitTest
 * Author: silence
 * Update: silence(2017-04-21 10:20)
 */
public class InstanceInitTest
{
    //先执行初始化块将a Field赋值为6
    {
        a = 6;
    }
    //再执行将a Field赋值为9
    int a = 9;
    public static void main(String[] args)
    {
        //下面代码将输出9。
        System.out.println(new InstanceInitTest().a);
    }
}

