package s05.System;

/**
 * Description: ExecTest
 * Author: silence
 * Update: silence(2017-04-21 18:25)
 */
public class ExecTest {
    public static void main(String[] args)
            throws Exception
    {
        Runtime rt = Runtime.getRuntime();
        //运行记事本程序
        rt.exec("notepad.exe");
    }
}
