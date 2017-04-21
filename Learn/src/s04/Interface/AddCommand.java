package s04.Interface;

/**
 * Description: AddCommand
 * Author: silence
 * Update: silence(2017-04-21 15:03)
 */
public class AddCommand implements Command {
    public void process(int[] target)
    {
        int sum = 0;
        for (int tmp : target )
        {
            sum += tmp;
        }
        System.out.println("数组元素的总和是:" + sum);
    }
}
