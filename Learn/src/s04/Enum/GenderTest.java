package s04.Enum;

/**
 * Description: GenderTest
 * Author: silence
 * Update: silence(2017-04-21 16:48)
 */
public class GenderTest {
    public static void main(String[] args)
    {
        //通过Enum的valueOf方法来获取指定枚举类的枚举值
        Gender g = Enum.valueOf(Gender.class , "FEMALE");
        //直接为枚举值的Field赋值
        g.name = "女";
        //直接访问枚举值的Field值
        System.out.println(g + "代表:" + g.name);
    }
}
