package s04.Calculate;

/**
 * Description: OverrideEqualsRight
 * Author: silence
 * Update: silence(2017-04-21 13:26)
 */
//定义一个Person类
class Person2
{
    private String name;
    private String idStr;
    public Person2(){}
    public Person2(String name , String idStr)
    {
        this.name = name;
        this.idStr = idStr;
    }
    //此处省略name和idStr的setter和getter方法。
    //name属性的setter和getter方法
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }

    //idStr属性的setter和getter方法
    public void setIdStr(String idStr)
    {
        this.idStr = idStr;
    }
    public String getIdStr()
    {
        return this.idStr;
    }
    //重写equals方法，提供自定义的相等标准
    public boolean equals(Object obj)
    {
        // 如果两个对象为同一个对象
        if (this == obj)
            return true;
        //只有当obj是Person对象
        if (obj != null && obj.getClass() == Person2.class)
        {
            Person2 personObj = (Person2)obj;
            //并且当前对象的idStr与obj对象的idStr相等才可判断两个对象相等
            if (this.getIdStr().equals(personObj.getIdStr()))
            {
                return true;
            }
        }
        return false;
    }
}
public class OverrideEqualsRight
{
    public static void main(String[] args)
    {
        Person2 p1 = new Person2("孙悟空" , "12343433433");
        Person2 p2 = new Person2("孙行者" , "12343433433");
        Person2 p3 = new Person2("孙悟饭" , "99933433");
        //p1和p2的idStr相等，所以输出true
        System.out.println("p1和p2是否相等？"
                + p1.equals(p2));
        //p2和p3的idStr不相等，所以输出false
        System.out.println("p2和p3是否相等？"
                + p2.equals(p3));
    }
}
