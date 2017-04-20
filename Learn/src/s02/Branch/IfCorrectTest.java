package s02.Branch;

/**
 * Description: IfCorrectTest
 * Author: silence
 * Update: silence(2017-04-20 16:32)
 */
public class IfCorrectTest {
    public static void main(String[] args)
    {
        int age = 45;
        if (age > 60)
        {
            System.out.println("老年人");
        }
        else if (age > 40)
        {
            System.out.println("中年人");
        }
        else if (age > 20)
        {
            System.out.println("青年人");
        }
    }
}
