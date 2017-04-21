package s04.Calculate;

/**
 * Description: PrintObject
 * Author: silence
 * Update: silence(2017-04-21 13:29)
 */
class Person3
{
    private String name;
    public Person3(String name)
    {
        this.name = name;
    }
    public void info()
    {
        System.out.println("此人名为：" + name);
    }
}
public class PrintObject
{
    public static void main(String[] args)
    {
        //创建一个Person对象，将之赋给p变量
        Person3 p = new Person3("孙悟空");
        //打印p所引用的Person对象
        System.out.println(p);
    }
}