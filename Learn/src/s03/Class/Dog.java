package s03.Class;

/**
 * Description: Dog
 * Author: silence
 * Update: silence(2017-04-20 18:22)
 */
public class Dog {
    //定义一个jump方法
    public void jump()
    {
        System.out.println("正在执行jump方法");
    }
    //定义一个run方法，run方法需要借助jump方法
    public void run()
    {
        //使用this引用调用run()方法的对象
        this.jump();
        System.out.println("正在执行run方法");
    }



}
