package s04.Finalize;

/**
 * Description: FinalizeTest
 * Author: silence
 * Update: silence(2017-04-21 17:16)
 */
public class FinalizeTest {
    private static FinalizeTest ft = null;
    public void info()
    {
        System.out.println("测试资源清理的finalize方法");
    }
    public static void main(String[] args) throws Exception
    {
        //创建FinalizeTest对象立即进入可恢复状态
        new FinalizeTest();
        //通知系统进行资源回收
//		System.gc();    //①
//		//让程序暂停2秒
//		Thread.sleep(2000);    //②
        ft.info();
    }
    public void finalize()
    {
        //让ft引用到试图回收的可恢复对象，可恢复对象重新变成可达状态
        ft = this;
    }
}
