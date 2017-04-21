package s06.Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Description: IteratorErrorTest
 * Author: silence
 * Update: silence(2017-04-21 21:12)
 */
public class IteratorErrorTest {
    public static void main(String[] args)
    {
        //创建一个集合
        Collection books = new HashSet();
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        books.add("疯狂Android讲义");
        //获取books集合对应的迭代器
        Iterator it = books.iterator();
        while(it.hasNext())
        {
            String book = (String)it.next();
            System.out.println(book);
            if (book.equals("疯狂Android讲义"))
            {
                //使用Iterator迭代过程中，不可修改集合元素,下面代码引发异常
                books.remove(book);
            }
        }
    }
}
