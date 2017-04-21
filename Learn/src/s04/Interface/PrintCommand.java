package s04.Interface;

/**
 * Description: PrintCommand
 * Author: silence
 * Update: silence(2017-04-21 15:02)
 */
public class PrintCommand implements Command {
    public void process(int[] target)
    {
        for (int tmp : target )
        {
            System.out.println("迭代输出目标数组的元素:" + tmp);
        }
    }
}
