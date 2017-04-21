package s04.Interface;

/**
 * Description: CommandTest
 * Author: silence
 * Update: silence(2017-04-21 15:02)
 */
public class CommandTest {
    public static void main(String[] args)
    {
        ProcessArray pa = new ProcessArray();
        int[] target = {3, -4, 6, 4};
        //第一次处理数组，具体处理行为取决于PrintCommand
        pa.process(target , new PrintCommand());
        System.out.println("------------------");
        //第二次处理数组，具体处理行为取决于AddCommand
        pa.process(target , new AddCommand());
    }
}
