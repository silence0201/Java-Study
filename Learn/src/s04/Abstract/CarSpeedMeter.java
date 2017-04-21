package s04.Abstract;

/**
 * Description: CarSpeedMeter
 * Author: silence
 * Update: silence(2017-04-21 14:38)
 */
public class CarSpeedMeter extends SpeedMeter {
    public double getRadius()
    {
        return 0.28;
    }
    public static void main(String[] args)
    {
        CarSpeedMeter csm = new CarSpeedMeter();
        csm.setTurnRate(15);
        System.out.println(csm.getSpeed());
    }
}
