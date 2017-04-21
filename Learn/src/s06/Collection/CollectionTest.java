package s06.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Description: CollectionTest
 * Author: silence
 * Update: silence(2017-04-21 21:06)
 */
public class CollectionTest {
    public static void main(String[] args)
    {
        Collection c = new ArrayList();
        //添加元素
        c.add("孙悟空");
        //虽然集合里不能放基本类型的值，但Java支持自动装箱
        c.add(6);
        System.out.println("c集合的元素个数为:" + c.size());
        //删除指定元素
        c.remove(6);
        System.out.println("c集合的元素个数为:" + c.size());
        //判断是否包含指定字符串
        System.out.println("c集合的是否包含\"孙悟空\"字符串:"
                + c.contains("孙悟空"));
        c.add("轻量级Java EE企业应用实战");
        System.out.println("c集合的元素：" + c);
        Collection books = new HashSet();
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        System.out.println("c集合是否完全包含books集合？"
                + c.containsAll(books));
        //用c集合减去books集合里的元素
        c.removeAll(books);
        System.out.println("c集合的元素：" + c);
        //删除c集合里所有元素
        c.clear();
        System.out.println("c集合的元素：" + c);
        //books集合里只剩下c集合里也包含的元素
        books.retainAll(c);
        System.out.println("books集合的元素:" + books);
    }
}
