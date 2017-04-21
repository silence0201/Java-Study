package s04.Interface;

/**
 * Description: Output
 * Author: silence
 * Update: silence(2017-04-21 14:45)
 */
public interface Output {
    //接口里定义的Field只能是常量
    int MAX_CACHE_LINE = 50;
    //接口里定义的只能是public的抽象实例方法
    void out();
    void getData(String msg);

    default void test() {
        System.out.println("默认test()方法");
    }
}
