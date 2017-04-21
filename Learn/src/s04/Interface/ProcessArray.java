package s04.Interface;

/**
 * Description: ProcessArray
 * Author: silence
 * Update: silence(2017-04-21 15:01)
 */
public class ProcessArray {
    public void process(int[] target , Command cmd)
    {
        cmd.process(target);
    }
}
