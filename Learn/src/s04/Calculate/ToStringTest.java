package s04.Calculate;

/**
 * Description: ToStringTest
 * Author: silence
 * Update: silence(2017-04-21 13:30)
 */
class Apple
{
    private String color;
    private double weight;
    public Apple(){	}
    //提供有参数的构造器
    public Apple(String color , double weight)
    {
        this.color = color;
        this.weight = weight;
    }

    //color属性的setter和getter方法
    public void setColor(String color)
    {
        this.color = color;
    }
    public String getColor()
    {
        return this.color;
    }

    //weight属性的setter和getter方法
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public double getWeight()
    {
        return this.weight;
    }

    //重写toString方法，用于实现Apple对象的"自我描述"
    public String toString()
    {
        return "一个苹果，颜色是：" + color
                + "，重量是：" + weight;
    }
}
public class ToStringTest
{
    public static void main(String[] args)
    {
        Apple a = new Apple("红色" , 5.68);
        //打印Apple对象
        System.out.println(a);
    }
}
