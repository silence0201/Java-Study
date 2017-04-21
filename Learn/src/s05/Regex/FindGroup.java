package s05.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Description: FindGroup
 * Author: silence
 * Update: silence(2017-04-21 20:04)
 */
public class FindGroup {
    public static void main(String[] args)
    {

        //创建一个Pattern对象，并用它建立一个Matcher对象
        Matcher m = Pattern.compile("\\w+")
                .matcher("Java is very easy!");
        while(m.find())
        {
            System.out.println(m.group());
        }
        int i = 0;
        while(m.find(i))
        {
            System.out.print(m.group() + "\t");
            i++;
        }
    }
}
