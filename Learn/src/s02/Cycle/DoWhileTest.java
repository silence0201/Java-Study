package s02.Cycle;

/**
 * Description: DoWhileTest
 * Author: silence
 * Update: silence(2017-04-20 16:45)
 */
public class DoWhileTest {
    public static void main(String[] args)
    {
        //定义变量count
        int count = 1;
        //执行do while循环
        do
        {
            System.out.println(count);
            // 循环迭代语句
            count++;
            //循环条件紧跟while关键字
        }while (count < 10);
        System.out.println("循环结束!");

        //定义变量count2
        int count2 = 20;
        //执行do while循环
        do
            //这行代码把循环体和迭代部分合并成了一行代码
            System.out.println(count2++);
        while (count2 < 10);
        System.out.println("循环结束!");
    }
}
