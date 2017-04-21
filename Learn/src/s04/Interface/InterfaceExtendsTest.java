package s04.Interface;

/**
 * Description: InterfaceExtendsTest
 * Author: silence
 * Update: silence(2017-04-21 14:48)
 */
interface interfaceA
{
    int PROP_A = 5;
    void testA();
}
interface interfaceB
{
    int PROP_B = 6;
    void testB();
}
interface interfaceC extends interfaceA, interfaceB
{
    int PROP_C = 7;
    void testC();
}
public class InterfaceExtendsTest
{
    public static void main(String[] args)
    {
        System.out.println(interfaceC.PROP_A);
        System.out.println(interfaceC.PROP_B);
        System.out.println(interfaceC.PROP_C);
    }
}
