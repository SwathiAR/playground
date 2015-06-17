import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 6/11/2015.
 */
public class PowerOfNumberTest {

    PowerOfNumber powerOfNumber = new PowerOfNumber();

    @Test
    public void shouldCalculatePowerOfNumber() {
        Assert.assertEquals(1, powerOfNumber.calculatePower(1, 1));
        Assert.assertEquals(1, powerOfNumber.calculatePower(1, 8));
        Assert.assertEquals(16, powerOfNumber.calculatePower(2, 4));
        Assert.assertEquals(1, powerOfNumber.calculatePower(6, 0));
        Assert.assertEquals(-1, powerOfNumber.calculatePower(8, -1));
    }

    @Test
    public void shouldCalculatePowerOfNumberRecursively() {
        Assert.assertEquals(1, powerOfNumber.recursiveCalculatePower(1, 1));
        Assert.assertEquals(1, powerOfNumber.recursiveCalculatePower(1, 8));
        Assert.assertEquals(16, powerOfNumber.recursiveCalculatePower(2, 4));
        Assert.assertEquals(1, powerOfNumber.recursiveCalculatePower(6, 0));
        Assert.assertEquals(-1, powerOfNumber.recursiveCalculatePower(8, -1));
    }
}