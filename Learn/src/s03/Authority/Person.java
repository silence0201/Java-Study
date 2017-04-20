package s03.Authority;

/**
 * Description: Person
 * Author: silence
 * Update: silence(2017-04-20 20:34)
 */
public class Person {
    //将Field使用private修饰，将这些Field隐藏起来
    private String name;
    private int age;
    //提供方法来操作name Field
    public void setName(String name)
    {
        //执行合理性校验，要求用户名必须在2～6位之间
        if (name.length() > 6 || name.length() < 2)
        {
            System.out.println("您设置的人名不符合要求");
            return;
        }
        else
        {
            this.name = name;
        }
    }
    public String getName()
    {
        return this.name;
    }
    //提供方法来操作age Field
    public void setAge(int age)
    {
        //执行合理性校验，要求用户年龄必须在0～100之间
        if (age > 100 || age < 0)
        {
            System.out.println("您设置的年龄不合法");
            return;
        }
        else
        {
            this.age = age;
        }
    }
    public int getAge()
    {
        return this.age;
    }
}
