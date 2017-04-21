package s04.Interface;

/**
 * Description: OutputFactory
 * Author: silence
 * Update: silence(2017-04-21 15:00)
 */
public class OutputFactory {
    public Output getOutput()
    {
        return new Printer();
    }
    public static void main(String[] args)
    {
        OutputFactory of = new OutputFactory();
        Computer c = new Computer(of.getOutput());
        c.keyIn("轻量级Java EE企业应用实战");
        c.keyIn("疯狂Java讲义");
        c.print();
    }
}
