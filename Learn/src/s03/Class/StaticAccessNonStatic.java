package s03.Class;

/**
 * Description: StaticAccessNonStatic
 * Author: silence
 * Update: silence(2017-04-20 18:41)
 */
public class StaticAccessNonStatic {
    static public void info()
    {
        System.out.println("简单的info方法");
    }
    public static void main(String[] args)
    {
        //因为main方法是静态方法，而info是非静态方法，
        //调用main方法的是该类本身，而不是该类的实例，
        //因此省略的this无法指向有效的对象
        info();
    }
}
