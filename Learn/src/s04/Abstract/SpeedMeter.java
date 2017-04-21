package s04.Abstract;

/**
 * Description: SpeedMeter
 * Author: silence
 * Update: silence(2017-04-21 14:37)
 */
public abstract class SpeedMeter {
    //转速
    private double turnRate;
    public SpeedMeter()
    {
    }
    //把返回车轮半径的方法定义成抽象方法
    public abstract double getRadius();
    public void setTurnRate(double turnRate)
    {
        this.turnRate = turnRate;
    }
    //定义计算速度的通用算法
    public double getSpeed()
    {
        //速度等于 车轮半径 * 2 * PI * 转速
        return java.lang.Math.PI * 2 * getRadius() * turnRate;
    }
}
