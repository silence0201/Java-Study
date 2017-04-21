package s04.Interface;

/**
 * Description: Computer
 * Author: silence
 * Update: silence(2017-04-21 14:59)
 */
public class Computer {
    private Output out;
    public Computer(Output out)
    {
        this.out = out;
    }
    //定义一个模拟获取字符串输入的方法
    public void keyIn(String msg)
    {
        out.getData(msg);
    }
    //定义一个模拟打印的方法
    public void print()
    {
        out.out();
    }
}
