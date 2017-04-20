package s03.Extends;

/**
 * Description: Apple
 * Author: silence
 * Update: silence(2017-04-20 21:03)
 */
public class Apple extends Fruit{
    public static void main(String[] args)
    {
        //创建Apple的对象
        Apple a = new Apple();
        //Apple对象本身没有weight Field
        //因为Apple的父类有weight Field，也可以访问Apple对象的Field
        a.weight = 56;
        //调用Apple对象的info方法
        a.info();
    }
}
