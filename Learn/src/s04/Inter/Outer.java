package s04.Inter;

/**
 * Description: Outer
 * Author: silence
 * Update: silence(2017-04-21 15:32)
 */
public class Outer
{
    private int outProp = 9;
    class Inner
    {
        private int inProp = 5;
        public void acessOuterProp()
        {
            //非静态内部类可以直接访问外部类的成员
            System.out.println("外部类的outProp值:"
                    + outProp);
        }
    }
    public void accessInnerProp()
    {
        //外部类不能直接访问非静态内部类的实例Field,
        //下面代码出现编译错误
        //System.out.println("内部类的inProp值:" + inProp);
        //如需访问内部类的实例Field，必须显式创建内部类对象
        System.out.println("内部类的inProp值:"
                + new Inner().inProp);
    }
    public static void main(String[] args)
    {
        //执行下面代码，只创建了外部类对象，还未创建内部类对象
        Outer out = new Outer();      //①
        out.accessInnerProp();
    }
}
