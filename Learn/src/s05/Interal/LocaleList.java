package s05.Interal;

import java.util.Locale;

/**
 * Description: LocaleList
 * Author: silence
 * Update: silence(2017-04-21 20:41)
 */
public class LocaleList {
    public static void main(String[] args)
    {
        // 返回Java所支持的全部国家和语言的数组
        Locale[] localeList = Locale.getAvailableLocales();
        // 遍历数组的每个元素，依次获取所支持的国家和语言
        for (int i = 0; i < localeList.length ; i++ )
        {
            // 输出出所支持的国家和语言
            System.out.println(localeList[i].getDisplayCountry()
                    + "=" + localeList[i].getCountry()+ " "
                    + localeList[i].getDisplayLanguage()
                    + "=" + localeList[i].getLanguage());
        }
    }
}
