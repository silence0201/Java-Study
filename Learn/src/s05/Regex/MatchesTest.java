package s05.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Description: MatchesTest
 * Author: silence
 * Update: silence(2017-04-21 20:10)
 */
public class MatchesTest
{
    public static void main(String[] args)
    {
        String[] mails =
                {
                        "kongyeeku@163.com" ,
                        "kongyeeku@gmail.com",
                        "ligang@crazyit.org",
                        "wawa@abc.xx"
                };
        String mailRegEx = "\\w{3,20}@\\w+\\.(com|org|cn|net|gov)";
        Pattern mailPattern = Pattern.compile(mailRegEx);
        Matcher matcher = null;
        for (String mail : mails)
        {
            if (matcher == null)
            {
                matcher = mailPattern.matcher(mail);
            }
            else
            {
                matcher.reset(mail);
            }
            String result = mail + (matcher.matches() ? "是" : "不是")
                    + "一个有效的邮件地址！";
            System.out.println(result);
        }
    }
}