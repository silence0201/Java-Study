package s02.Branch;

/**
 * Description: IfCorrectTest2
 * Author: silence
 * Update: silence(2017-04-20 16:32)
 */
public class IfCorrectTest2 {
    public static void main(String[] args)
    {
        int age = 45;
        if (age > 60)
        {
            System.out.println("老年人");
        }
        //在原本的if条件中增加了else的隐含条件
        else if (age > 40 && !(age >60))
        {
            System.out.println("中年人");
        }
        //在原本的if条件中增加了else的隐含条件
        else if (age > 20 && !(age > 60) && !(age > 40 && !(age >60)))
        {
            System.out.println("青年人");
        }
    }
}
