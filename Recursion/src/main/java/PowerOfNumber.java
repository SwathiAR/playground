/**
 * Created by swathi on 6/11/2015.
 */
public class PowerOfNumber {

    public int calculatePower(int num, int exponent) {
        int power = 1;
        if (exponent < 0) {
            power = -1;
        }
        for (int i = 1; i <= exponent; i++) {
            power = power * num;
        }
        return power;
    }


    public int recursiveCalculatePower(int num, int exponent) {

        if (exponent < 0) {
            return  -1;
        }

        if(exponent ==0)
        {
            return 1;
        }
        return num * recursiveCalculatePower(num , exponent-1);
    }


}
