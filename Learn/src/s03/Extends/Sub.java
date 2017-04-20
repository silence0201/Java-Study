package s03.Extends;

/**
 * Description: Sub
 * Author: silence
 * Update: silence(2017-04-20 22:48)
 */
class Base
{
    public double size;
    public String name;
    public Base(double size , String name)
    {
        this.size = size;
        this.name = name;
    }
}
public class Sub extends Base
{
    public String color;
    public Sub(double size , String name , String color)
    {
        //通过super调用来调用父类构造器的初始化过程
        super(size , name);
        this.color = color;
    }
    public static void main(String[] args)
    {
        Sub s = new Sub(5.6 , "测试对象" , "红色");
        //输出Sub对象的三个Field
        System.out.println(s.size + "--" + s.name
                + "--" + s.color);
    }
}
