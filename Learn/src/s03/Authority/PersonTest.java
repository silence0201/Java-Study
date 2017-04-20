package s03.Authority;

/**
 * Description: PersonTest
 * Author: silence
 * Update: silence(2017-04-20 20:36)
 */
public class PersonTest {
    public static void main(String[] args)
    {
        Person p = new Person();
        //因为age Field已被隐藏，所以下面语句将出现编译错误。
        //p.age = 1000;
        //下面语句编译不会出现错误，但运行时将提示"您设置的年龄不合法"
        //程序不会修改p的age Field
        p.setAge(1000);
        //访问p的age Field也必须通过其对应的getter方法
        //因为上面从未成功设置p的age Field，故此处输出0
        System.out.println("未能设置age Field时："
                + p.getAge());
        //成功修改p的age Field
        p.setAge(30);
        //因为上面成功设置了p的age Field，故此处输出30
        System.out.println("成功设置age Field后："
                + p.getAge());
        //不能直接操作p的name Field，只能通过其对应的setter方法
        //因为"李刚"字符串长度满足2~6,所以可以成功设置
        p.setName("李刚");
        System.out.println("成功设置name Field后："
                + p.getName());
    }
}
