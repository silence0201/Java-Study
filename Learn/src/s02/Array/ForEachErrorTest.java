package s02.Array;

/**
 * Description: ForEachErrorTest
 * Author: silence
 * Update: silence(2017-04-20 17:19)
 */
public class ForEachErrorTest {
    public static void main(String[] args)
    {
        String[] books = {"轻量级Java EE企业应用实战" ,
                "疯狂Java讲义",
                "疯狂Android讲义"};
        //使用foreach循环来遍历数组元素，其中book将会自动迭代每个数组元素
        for (String book : books)
        {
            book = "疯狂Ajax讲义";
            System.out.println(book);
        }
        System.out.println(books[0]);
    }
}
