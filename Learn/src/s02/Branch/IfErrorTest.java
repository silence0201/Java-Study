package s02.Branch;

/**
 * Description: IfErrorTest
 * Author: silence
 * Update: silence(2017-04-20 16:33)
 */
public class IfErrorTest {
    public static void main(String[] args)
    {
        int age = 45;
        if (age > 20)
        {
            System.out.println("青年人");
        }
        else if (age > 40)
        {
            System.out.println("中年人");
        }
        else if (age > 60)
        {
            System.out.println("老年人");
        }
    }
}
