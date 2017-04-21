package s05.Interaction;

import java.util.Scanner;
/**
 * Description: ScannerLongTest
 * Author: silence
 * Update: silence(2017-04-21 18:02)
 */
public class ScannerLongTest {
    public static void main(String[] args)
    {
        //System.in代表标准输入，就是键盘输入
        Scanner sc = new Scanner(System.in);
        //判断是否还有下一个long整数
        while(sc.hasNextLong())
        {
            //输出输入项
            System.out.println("键盘输入的内容是："
                    + sc.nextLong());
        }
    }
}
