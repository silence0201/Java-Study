package s04.Final;

/**
 * Description: Person
 * Author: silence
 * Update: silence(2017-04-21 14:23)
 */
class Name
{
    private String firstName;
    private String lastName;
    public Name(){}
    public Name(String firstName , String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
}
public class Person2
{
    private final Name name;
    public Person2(Name name)
    {
        this.name = name;
    }
    public Name getName()
    {
        return name;
    }
    public static void main(String[] args)
    {
        Name n = new Name("悟空", "孙");
        Person2 p = new Person2(n);
        // Person对象的name的firstName值为"悟空"
        System.out.println(p.getName().getFirstName());
        // 改变Person对象name的firstName值
        n.setFirstName("八戒");
        // Person对象的name的firstName值被改为"八戒"
        System.out.println(p.getName().getFirstName());
    }
}