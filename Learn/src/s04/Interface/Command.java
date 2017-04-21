package s04.Interface;

/**
 * Description: Command
 * Author: silence
 * Update: silence(2017-04-21 15:01)
 */
public interface Command {
    //接口里定义的process方法用于封装“处理行为”
    void process(int[] target);
}
