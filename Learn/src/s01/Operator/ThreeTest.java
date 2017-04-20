package s01.Operator;

/**
 * Description: ThreeTest
 * Author: silence
 * Update: silence(2017-04-20 16:25)
 */
public class ThreeTest {
    public static void main(String[] args) {
        String str = 5 > 3 ? "5大于3" : "5不大于3";
        System.out.println(str);

        String str2 = null;
        if (5 > 3) {
            str2 = "5大于3";
        } else {
            str2 = "5不大于3";
        }
    }
}
